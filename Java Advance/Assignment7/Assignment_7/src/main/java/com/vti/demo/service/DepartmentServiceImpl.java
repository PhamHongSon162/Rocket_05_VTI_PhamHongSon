package com.vti.demo.service;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.vti.demo.dto.DepartmentDTO;
import com.vti.demo.entity.Department;
import com.vti.demo.reponsitory.DepartmentReponsitory;
import com.vti.demo.validation.OnUpdate;
import com.vti.demo.validation.Oncreate;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentReponsitory departmentrepository;
	
	public List<DepartmentDTO> getAllDepartments(){
		return departmentrepository.getAllDepartments();
	}

	public List<DepartmentDTO> getAllDepartments(int pageNumber, int pageSize, String search, String filter, String sort) {
		return departmentrepository.getAllDepartments(pageNumber, pageSize, search, filter, sort);
	}
	
	public long getTotalCount(String search, String filter) {
		return departmentrepository.getTotalCount(search, filter);
	}

	public Department getDepartmentByID(short id) {
		return departmentrepository.getDepartmentByID(id);
	}

	public Department getDepartmentByName(String name) {
		return departmentrepository.getDepartmentByName(name);
	}

	@Validated(Oncreate.class)
	public void createDepartment(@Valid Department department) {
		departmentrepository.createDepartment(department);
	}

	public void updateDepartment(short id, String newName) {
		departmentrepository.updateDepartment(id, newName);
	}

	@Validated(OnUpdate.class)
	public void updateDepartment(@Valid Department department) {
		departmentrepository.updateDepartment(department);
	}

	public void deleteDepartment(short id) {
		departmentrepository.deleteDepartment(id);
	}

	public boolean isDepartmentExistsByID(short id) {
		return departmentrepository.isDepartmentExistsByID(id);
	}

	public boolean isDepartmentExistsByName(String name) {
		return departmentrepository.isDepartmentExistsByName(name);
	}
}