package com.muba.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muba.EmpDashBEntity.EmployeeEntity;
import com.muba.EmployeeService.EmpDashbService;

@RestController
@RequestMapping("/api/employees")
public class EmpDashbRestController {
	
	@Autowired
	private EmpDashbService empService;
	
	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {
		return empService.saveEmployee(employee);
	}
	
	@GetMapping
	public List<EmployeeEntity> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("/filterByDepartment")
	public List<EmployeeEntity> filterByDepartment(@RequestParam String department){
		return empService.filterByDepartment(department);
	}
	
	@GetMapping("/filterByGender")
	public List<EmployeeEntity> filterByGender(@RequestParam String gender){
		return empService.filterByGender(gender);
		
	}
	
	@GetMapping("/filterByAgeGreaterThan")
	public List<EmployeeEntity> filterByAgeGreaterThan(@RequestParam int age) {
		return empService.filterByAgeGreaterThan(age);
	}
	
	@GetMapping("/filterBySalaryRange")
	public List<EmployeeEntity> filterBySalaryRange(@RequestParam double min,@RequestParam double max){
	return empService.filterBySalaryRange(min, max);

}

}