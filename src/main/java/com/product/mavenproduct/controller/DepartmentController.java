package com.product.mavenproduct.controller;

import com.product.mavenproduct.dto.DepartmentDTO;
import com.product.mavenproduct.entity.Department;
import com.product.mavenproduct.service.IDepartmentService;
import com.product.mavenproduct.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody DepartmentDTO dto) {
        return this.departmentService.saveDepartment(dto);
    }

    @GetMapping
    public List<Department> fetchDepartmentList() {
        return this.departmentService.fetchDepartmentList();
    }

    @PutMapping("/update/{id}")
    public Department updateDepartment(@RequestBody DepartmentDTO departmentDTO, @PathVariable long id) throws ResourceNotFoundException {
        return  this.departmentService.updateDepartment(departmentDTO, id);
    }

    @DeleteMapping("/delete/{departmentId}")
    public void deleteDepartmentById(@PathVariable("departmentId") Long departmentId) throws ResourceNotFoundException {
        this.departmentService.deleteDepartmentById(departmentId);
    }

}
