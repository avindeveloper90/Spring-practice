package com.product.mavenproduct.service;

import com.product.mavenproduct.dto.DepartmentDTO;
import com.product.mavenproduct.entity.Department;
import com.product.mavenproduct.exception.ResourceNotFoundException;

import java.util.List;

public interface IDepartmentService {

    Department saveDepartment(DepartmentDTO dto);

    List<Department> fetchDepartmentList();

    Department updateDepartment(DepartmentDTO departmentDTO, Long id) throws ResourceNotFoundException;

    void deleteDepartmentById(Long departmentId) throws ResourceNotFoundException;
}
