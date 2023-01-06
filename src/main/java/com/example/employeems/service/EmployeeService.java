package com.example.employeems.service;


import com.example.employeems.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    String saveEmployee(EmployeeDTO employeeDTO);

    String updateEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO searchEmployee(int empId);

    String deleteEmployee(int empId);
}
