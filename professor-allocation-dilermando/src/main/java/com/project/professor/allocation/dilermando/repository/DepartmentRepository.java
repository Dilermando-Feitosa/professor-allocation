package com.project.professor.allocation.dilermando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.dilermando.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	List<Department> findByNameContainingIgnoreCase(String name);

}
