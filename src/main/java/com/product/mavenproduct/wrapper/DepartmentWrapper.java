package com.product.mavenproduct.wrapper;

import com.product.mavenproduct.dto.DepartmentDTO;
import com.product.mavenproduct.entity.Department;

public class DepartmentWrapper {

    public static Department mapDepartment(DepartmentDTO dto){
        Department department = Department.builder().build();
        department.setDepartmentName(dto.getDepartmentName());
        department.setDepartmentCode(dto.getDepartmentCode());
        department.setDepartmentAddress(dto.getDepartmentAddress());
        return department;
    }
}
