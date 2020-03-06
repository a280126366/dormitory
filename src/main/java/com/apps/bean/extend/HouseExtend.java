package com.apps.bean.extend;

import java.util.List;

import com.apps.bean.Employee;
import com.apps.bean.House;

public class HouseExtend extends House{
	
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
