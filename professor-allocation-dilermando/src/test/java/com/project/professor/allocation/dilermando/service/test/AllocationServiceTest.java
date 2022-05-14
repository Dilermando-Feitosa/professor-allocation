package com.project.professor.allocation.dilermando.service.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.dilermando.entity.Allocation;
import com.project.professor.allocation.dilermando.service.AllocationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationServiceTest {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

    @Autowired
    AllocationService allocationService;

    @Test
    public void findAll() {
        // Act
    	List<Allocation> allocations = allocationService.findAll();

        // Print
        allocations.forEach(System.out::println);
    }

    @Test
    public void findByProfessor() {
        // Arrange

        // Act

        // Print
    }

    @Test
    public void findByCourse() {
        // Arrange

        // Act

        // Print
    }

    @Test
    public void findById() {
        // Arrange

		// Act
        Allocation allocations = allocationService.findById(1L);

        // Print
        System.out.println(allocations);

    }

    @Test
    public void save() throws ParseException {
        // Arrange
        Allocation allocation = new Allocation();
        allocation.setId(null);
        allocation.setDayOfWeek(DayOfWeek.SUNDAY);
        allocation.setStartHour(sdf.parse("19:00-0300"));
        allocation.setEndHour(sdf.parse("20:00-0300"));
        allocation.setProfessorId(1L);
        allocation.setCourseId(1L);

        // Act
        allocation = allocationService.save(allocation);
        
        // Print
        System.out.println(allocation);		
    }

    @Test
    public void update() throws ParseException {
        // Arrange

        // Act

    }

    @Test
    public void deleteById() {
        // Arrange

        // Act
    }

    @Test
    public void deleteAll() {
        // Act
    }
}
