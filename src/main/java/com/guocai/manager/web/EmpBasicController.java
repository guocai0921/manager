package com.guocai.manager.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.guocai.manager.base.ResponseMessage;
import com.guocai.manager.bo.EmployeeBO;
import com.guocai.manager.common.PoiUtils;
import com.guocai.manager.entity.Employee;
import com.guocai.manager.service.IDepartmentService;
import com.guocai.manager.service.IEmployeeService;
import com.guocai.manager.service.IJoblevelService;
import com.guocai.manager.service.IPositionService;
import com.guocai.manager.workerId.WorkId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

/**
 * java类简单作用描述
 *
 * @ClassName: EmpBasicController
 * @Package: com.guocai.manager.web
 * @Description: 员工信息Controller
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-14 18:51
 */
@RestController
@RequestMapping("/employee/basic")
public class EmpBasicController {
    @Autowired
    IEmployeeService empService;
    @Autowired
    IDepartmentService departmentService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IJoblevelService joblevelService;

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    @RequestMapping(value = "/basicdata", method = RequestMethod.GET)
    public Map<String, Object> getAllNations() {
        Map<String, Object> map = new HashMap<>();
        map.put("nations", empService.getAllNations());
        map.put("politics", empService.getAllPolitics());
        map.put("deps", departmentService.getDepByPid("-1"));
        map.put("positions", positionService.getAllPos());
        map.put("joblevels", joblevelService.getAllJobLevels());
        map.put("workID", String.format("%08d", empService.getMaxWorkID() + 1));
        return map;
    }

    @RequestMapping("/maxWorkID")
    public String maxWorkID() {
        return String.format("%08d", empService.getMaxWorkID() + 1);
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public Map<String, Object> getEmployeeByPage(@ApiIgnore @Valid EmployeeBO bo){
        if (bo.getBeginDateScope() != null && bo.getBeginDateScope().contains(",")) {
            try {
                String[] split = bo.getBeginDateScope().split(",");
                bo.setStartBeginDate(birthdayFormat.parse(split[0]));
                bo.setEndBeginDate(birthdayFormat.parse(split[1]));
            } catch (ParseException e) {
            }
        }
        Page<Employee> employeePage = empService.getEmployeeByPage(bo);
        Map<String, Object> map = new HashMap<>();
        map.put("emps", employeePage.getRecords());
        map.put("count", employeePage.getTotal());
        return map;
    }

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public ResponseMessage addEmp(Employee employee) {
        Date beginContract = employee.getBeginContract();
        Date endContract = employee.getEndContract();
        Double contractTerm = (Double.parseDouble(yearFormat.format(endContract)) - Double.parseDouble(yearFormat.format(beginContract))) * 12 + Double.parseDouble(monthFormat.format(endContract)) - Double.parseDouble(monthFormat.format(beginContract));
        employee.setContractTerm(Double.parseDouble(decimalFormat.format(contractTerm / 12)));
        employee.setWorkState(null);
        boolean bool = empService.insert(employee.setId(WorkId.nextId()));
        if (bool){
            return ResponseMessage.ok("添加成功!");
        }else {
            return ResponseMessage.error("添加失败!");
        }
    }
    @PutMapping(value = "/emp")
    public ResponseMessage updateEmp(@RequestBody Employee employee) {
         boolean bool = empService.updateById(employee);
        if (bool){
            return ResponseMessage.ok("修改成功!");
        }else {
            return ResponseMessage.error("修改失败!");
        }
    }

    @DeleteMapping("/emp/{id}")
    public ResponseMessage updateEmp(@PathVariable String id) {
        if (empService.deleteBatchIds(Arrays.asList(id.split(",")))) {
            return ResponseMessage.ok("删除成功!");
        }
        return ResponseMessage.error("删除失败!");
    }

    @RequestMapping(value = "/exportEmp", method = RequestMethod.GET)
    public ResponseEntity<byte[]> exportEmp() {
        return PoiUtils.exportEmp2Excel( empService.getAllEmployee());
    }

    @RequestMapping(value = "/importEmp", method = RequestMethod.POST)
    @Transactional
    public ResponseMessage importEmp(MultipartFile file) {
        List<Employee> emps = PoiUtils.importEmp2List(file,
                empService.getAllNations(), empService.getAllPolitics(),
                departmentService.getAllDeps(), positionService.getAllPos(),
                joblevelService.getAllJobLevels());
        for (Employee emp : emps) {

        }
        if (empService.insertBatch(emps.stream().map(p -> p.setId(WorkId.nextId())).collect(Collectors.toList()))) {
            return ResponseMessage.ok("导入成功!");
        }
        return ResponseMessage.error("导入失败!");
    }
}
