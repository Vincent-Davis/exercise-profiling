package com.advpro.profiling.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advpro.profiling.tutorial.model.Course;
/**
 * @author muhammad.khadafi
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}