package com.example.employeems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", length = 45)
    private int empId;

    @Column(name = "emp_name", length = 100, nullable = false)
    private String empName;

    @Column(name = "emp_address", length = 255, nullable = false)
    private String empAddress;

    @Column(name = "emp_Mobile_No")
    private String empMNumber;
}