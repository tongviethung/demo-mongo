package com.example.demo.repository;

import java.util.Date;

public interface EmployeeRepositoryCustom {

    public long updateEmployee(String empNo, String fullName, Date hireDate);

	public long getMaxEmpId();
    
}