package com.nsag.springbranch.Empmangement.service;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsag.springbranch.Empmangement.dao.EmployeeDaoImp;
import com.nsag.springbranch.Empmangement.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	public EmployeeDaoImp EmployeeDao;
	
	@Override
	@Transactional
	public void deleteEmployee(int id) {
		EmployeeDao.deleteEmployee(id);
	}

	@Override
	@Transactional
	public Employee updaCreate(Employee employee) {
		
		return EmployeeDao.updaCreate(employee);
	}

	@Override
	@Transactional
	public List<Employee> listofEmployee() {
		return EmployeeDao.listofEmployee();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
	
		return getEmployee(id);
	}

}
