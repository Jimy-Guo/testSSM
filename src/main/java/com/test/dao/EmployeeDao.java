package com.test.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import com.test.pojo.Employee;

public interface EmployeeDao {

	@Select("select * from employee")
	public List<Employee> getEmployee();

	@Select("select * from employee where id=#{id}")
	public List<Employee> selectEmployee(@Param("id") String id);
	
	@Delete("delete from employee where id=#{id}")
	public void deleteEmployee(@Param("id") String id);
	
	@Insert("insert into employee values(null,#{age},#{name},#{sex},#{address})")
	public void addEmployee(@Param("age") String age,@Param("name") String name,@Param("sex") String sex,@Param("address") String address);
	
	
}
