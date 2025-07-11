package com.muba.EmployeeService;

import java.util.List;

import com.muba.EmpDashBEntity.EmployeeEntity;

public interface EmpDashbService {
	EmployeeEntity saveEmployee(EmployeeEntity employee);
	
	List<EmployeeEntity> getAllEmployees();
	
    List<EmployeeEntity> filterByDepartment(String department);

	List<EmployeeEntity> filterByAgeGreaterThan(int age);

	List<EmployeeEntity> filterByGender(String gender);

	List<EmployeeEntity> filterBySalaryRange(double min, double max);
	
}
