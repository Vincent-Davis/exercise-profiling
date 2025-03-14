package com.advpro.profiling.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advpro.profiling.tutorial.model.Student;
/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findTopByOrderByGpaDesc();
}