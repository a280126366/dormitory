package com.apps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.bean.Employee;
import com.apps.bean.EmployeeExample;
import com.apps.dao.EmployeeMapper;
import com.apps.service.IEmployeeService;
import com.apps.utils.CustomerException;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Resource
	private EmployeeMapper employeeMapper;	
	
	/**
	 * 根据员工ID进行删除员工
	 * 
	 * */
	@Override
	public int deleteById(Integer id) {
		if(employeeMapper.selectByPrimaryKey(id)!=null) {
			employeeMapper.deleteByPrimaryKey(id);
			return 1;
		}
		return 0;
	}
	
	/**
	 * 增加或者更新员工
	 * 
	 * */
	@Override
	public void saveOrUpdate(Employee employee) throws CustomerException {
		
		if(employee.getEmId()!=null) {
			employeeMapper.updateByPrimaryKey(employee);
		}else {
			//初始化
			employeeMapper.insert(employee);
		}
		
	}	

	@Override
	public List<Employee> findAll() {
		EmployeeExample employeeExample = new EmployeeExample();
		return employeeMapper.selectByExample(employeeExample);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return employeeMapper.selectByPrimaryKey(id);
	}

}
