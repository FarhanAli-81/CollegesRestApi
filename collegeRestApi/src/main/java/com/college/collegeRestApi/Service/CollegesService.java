package com.college.collegeRestApi.Service;


import com.college.collegeRestApi.models.Colleges;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CollegesService {

    List<Colleges> fetchAll();

    List<Colleges> findByCourse(String courseName);
}
