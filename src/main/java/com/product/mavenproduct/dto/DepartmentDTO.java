package com.product.mavenproduct.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class DepartmentDTO {

    private String departmentName;
    private String departmentCode;
    private String departmentAddress;

}
