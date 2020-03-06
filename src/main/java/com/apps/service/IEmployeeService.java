package com.apps.service;

import java.util.List;

import com.apps.bean.Employee;
import com.apps.utils.CustomerException;


//员工类接口
public interface IEmployeeService {
	public int deleteById(Integer id);
	public void saveOrUpdate(Employee employee) throws CustomerException;
	public List<Employee> findAll();
	//public List<ArticleExtend> findArticleExtendAll();
	public Employee findEmployeeById(Integer id);
	//public ArticleExtend findArticleExtendById(Long id);
}
