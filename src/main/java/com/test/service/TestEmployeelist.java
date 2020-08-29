package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.pojo.Employee;

@Service("testEmployeeService")
public class TestEmployeelist implements EmployeeDao{
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmployee() {
		return employeeDao.getEmployee();
	}
	
	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}

	@Override
	public List<Employee> selectEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeDao.selectEmployee(id);
	}

	@Override
	public void addEmployee(String age, String name, String sex, String address) {
		// TODO Auto-generated method stub
		System.out.println(sex);
		if(sex.equals("ÄÐ"))
			sex="1";
		else 
			sex="0";
		employeeDao.addEmployee(age, name, sex, address);
	}
}
