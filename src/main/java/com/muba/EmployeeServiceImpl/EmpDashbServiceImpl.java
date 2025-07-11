package com.muba.EmployeeServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muba.EmpDashBEntity.EmployeeEntity;
import com.muba.EmployeeDashBrepo.EmployeeRepo;
import com.muba.EmployeeService.EmpDashbService;

@Service
public class EmpDashbServiceImpl implements EmpDashbService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public List<EmployeeEntity> filterByDepartment(String department) {
		return employeeRepo.findAll()
				.stream()
				.filter(emp -> emp.getDepartment() != null && 
				               emp.getDepartment().equalsIgnoreCase(department))
				.collect(Collectors.toList());
	}

	@Override
	public List<EmployeeEntity> filterByAgeGreaterThan(int age) {
		return employeeRepo.findAll()
				.stream()
				.filter(emp -> emp.getAge() != null && emp.getAge() > age )
				.collect(Collectors.toList());
	}

	@Override
	public List<EmployeeEntity> filterByGender(String gender) {
		
		return employeeRepo.findAll()
				.stream()
				.filter(emp -> emp.getGender() != null && emp.getGender().equalsIgnoreCase(gender))
				.collect(Collectors.toList());
				
	}

	@Override
	public List<EmployeeEntity> filterBySalaryRange(double min, double max) {
		return employeeRepo.findAll()
				.stream()
				.filter(emp -> emp.getSalary() != null && emp.getSalary() >= min && emp.getSalary() <= max  )
				.collect(Collectors.toList());
	}
	
	
	
	

}
