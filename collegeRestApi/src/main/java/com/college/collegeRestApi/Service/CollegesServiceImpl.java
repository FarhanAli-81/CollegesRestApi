package com.college.collegeRestApi.Service;

import com.college.collegeRestApi.Repository.CollegesRepository;
import com.college.collegeRestApi.models.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegesServiceImpl implements CollegesService{
    @Autowired
    private CollegesRepository collegesRepository;


    @Override
    public List<Colleges> fetchAll() {
        List<Colleges> l= collegesRepository.findAll();
        return l;
    }

    @Override
    public List<Colleges> findByCourse(String courseName) {
        List<Colleges> l=collegesRepository.findByCourseName(courseName);
        return l;
    }
}
