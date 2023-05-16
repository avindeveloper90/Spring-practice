package com.product.mavenproduct.service;

import com.product.mavenproduct.dto.DepartmentDTO;
import com.product.mavenproduct.entity.Department;
import com.product.mavenproduct.exception.ResourceNotFoundException;
import com.product.mavenproduct.repository.DepartmentRepository;
import com.product.mavenproduct.wrapper.DepartmentWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department saveDepartment(DepartmentDTO dto) {
        Department department = DepartmentWrapper.mapDepartment(dto);
        return repository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) repository.findAll();
    }

    @Override
    public Department updateDepartment(DepartmentDTO departmentDTO, Long id) throws ResourceNotFoundException {
        Department department = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department Id is missing :: " + id));
        if (null != department) {
             department = DepartmentWrapper.mapDepartment(departmentDTO);
        }

        return repository.save(department);
    }

    @Override
    public void deleteDepartmentById(Long departmentId) throws ResourceNotFoundException {
        Department department = repository.findById(departmentId).orElseThrow(() -> new ResourceNotFoundException("Department Id is missing :: "+ departmentId));
        if (null != department) {
            repository.deleteById(department.getDepartmentId());
        }
    }
}
