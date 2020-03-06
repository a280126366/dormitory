package com.apps.web.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.bean.Employee;
import com.apps.service.IEmployeeService;
import com.apps.utils.Message;
import com.apps.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "员工相关接口",tags = "employee")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@ApiOperation(value = "根据ID删除员工信息")
	@DeleteMapping(value = "deleteById")
	public Message articleDelete(Integer id) {
		if(employeeService.deleteById(id)==1) {
			return MessageUtil.success("success");
		}
		return MessageUtil.error("员工ID不存在");
	}
	
	@ApiOperation(value = "保存或更新员工信息",notes = "如果参数中包含id后端认为是更新操作，如果参数中不包含id认为是插入操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emId", value = "员工号",paramType = "form",required = false),
            @ApiImplicitParam(name = "emName", value = "员工姓名",paramType = "form",required = true),
            @ApiImplicitParam(name = "emGender", value = "员工性别",paramType = "form",required = true),
            @ApiImplicitParam(name = "emHouId", value = "楼房号",paramType = "form",required = false),
            @ApiImplicitParam(name = "post", value = "职位",paramType = "form",required = true),
            @ApiImplicitParam(name = "address", value = "住址",paramType = "form",required = false)
    })
    @PostMapping(value = "saveOrUpdate", produces = "application/json;charset=UTF-8")
    public Message saveOrUpdate(
            Long emId,
            @NotNull String emName,
            @NotNull String emGender,
            String emHouId,
            @NotNull String post,
            String address){
        Employee employee = new Employee();
        employee.setEmId(emId);
        employee.setEmName(emName);
        employee.setEmGender(emGender);
        employee.setEmHouid(emHouId);
        employee.setPost(post);
        employee.setAddress(address);
        employeeService.saveOrUpdate(employee);
        return MessageUtil.success("更新成功");
    }
	
	@ApiOperation(value = "查询所有员工")
	@PostMapping(value = "findAll")
	public Message findAll() {
		return MessageUtil.success(employeeService.findAll());
	}
	
	@ApiOperation(value = "根据ID查询员工")
	@PostMapping(value = "findEmployeeById")
	public Message findEmployeeById(Integer id) {
		return MessageUtil.success(employeeService.findEmployeeById(id));
	}
}
