package com.muba.EmployeeDashBrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muba.EmpDashBEntity.EmployeeEntity;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {
	
	
	

}
