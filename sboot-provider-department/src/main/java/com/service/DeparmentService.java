package com.service;

import com.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentService extends JpaRepository<Department,Long> {
}
