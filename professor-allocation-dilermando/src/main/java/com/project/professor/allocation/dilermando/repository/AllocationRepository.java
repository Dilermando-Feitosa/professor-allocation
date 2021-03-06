package com.project.professor.allocation.dilermando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.dilermando.entity.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
	
	List<Allocation> findByProfessorId(Long professorId);
	List<Allocation> findByCourseId(Long courseId);

}
