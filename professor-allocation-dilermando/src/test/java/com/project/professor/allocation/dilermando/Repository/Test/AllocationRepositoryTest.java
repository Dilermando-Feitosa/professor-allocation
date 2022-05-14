package com.project.professor.allocation.dilermando.Repository.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.dilermando.entity.Allocation;
import com.project.professor.allocation.dilermando.repository.AllocationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationRepositoryTest {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

    @Autowired
    AllocationRepository allocationRepository;

    @Test
    public void findAll() {
    	 // Act
        List<Allocation> allocations = allocationRepository.findAll();

        // Print
        allocations.forEach(System.out::println);
    }

    @Test
    public void findById() {
        // Arrange

        // Act
        Optional<Allocation> allocationOptional = allocationRepository.findById(5L);
        Allocation allocation = allocationOptional.orElse(null);
        
        // Print
        System.out.println(allocation);
    }

    @Test
    public void findByProfessorId() {
        // Arrange


        // Act
        

        // Print
        
    }

    @Test
    public void findByCourseId() {
        // Arrange
        

        // Act
        

        // Print
        
    }

    @Test
    public void save_create() throws ParseException {
        // Arrange
        Allocation allocation = new Allocation();
        allocation.setId(null);
        allocation.setDayOfWeek(DayOfWeek.SUNDAY);
        allocation.setStartHour(sdf.parse("19:00-0300"));
        allocation.setEndHour(sdf.parse("20:00-0300"));
        allocation.setProfessorId(1L);
        allocation.setCourseId(1L);

        // Act
        allocation = allocationRepository.save(allocation);

        // Print
        System.out.println(allocation);        
    }

    @Test
    public void save_update() throws ParseException {
    	// Arrange
        Allocation allocation = new Allocation();
        allocation.setId(2L);
        allocation.setDayOfWeek(DayOfWeek.MONDAY);
        allocation.setStartHour(sdf.parse("16:40-0300"));
        allocation.setEndHour(sdf.parse("17:40-0300"));
        allocation.setProfessorId(1L);
        allocation.setCourseId(1L);

        // Act
        allocation = allocationRepository.save(allocation);

        // Print
        System.out.println(allocation);        
    }

    @Test
    public void deleteById() {
        // Arrange
        
        // Act
        List<Allocation> allocations = allocationRepository.findAll();
        allocations.forEach(System.out::println);

        allocationRepository.deleteById(2L);

        List<Allocation> allocations2 = allocationRepository.findAll();
        allocations2.forEach(System.out::println);
        
    }

    @Test
    public void deleteAll() {
        // Act
        
    }
}
