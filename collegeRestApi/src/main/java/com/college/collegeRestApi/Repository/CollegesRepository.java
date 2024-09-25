package com.college.collegeRestApi.Repository;


import com.college.collegeRestApi.models.Colleges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CollegesRepository extends JpaRepository<Colleges, UUID> {
    public List<Colleges> findByCourseName(String courseName);
}
