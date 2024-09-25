package com.college.collegeRestApi.InsertIntoDatabase;


import com.college.collegeRestApi.Repository.CollegesRepository;
import com.college.collegeRestApi.models.Colleges;
import com.college.collegeRestApi.models.CourseFee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class InsertIntoDatabase {


    @Autowired
    private CollegesRepository collegesRepository;

    @PostConstruct
    public void insertIntoDatabase(){
        CourseFee courseFee1 = CourseFee.builder().fees(3000).build();
        CourseFee courseFee2 = CourseFee.builder().fees(4000).build();
        CourseFee courseFee3 = CourseFee.builder().fees(6000).build();
        CourseFee courseFee4 = CourseFee.builder().fees(3000).build();
        CourseFee courseFee5 = CourseFee.builder().fees(4000).build();
        CourseFee courseFee6 = CourseFee.builder().fees(6000).build();

        Colleges colleges1 = Colleges.builder().collegeName("Bvrit").courseDuration("2 months").accomodation("AC").accomodationFee(200).courseName("java").courseFee(courseFee1).build();
        Colleges colleges2 = Colleges.builder().collegeName("iit").courseDuration("4 months").accomodation("non-AC").accomodationFee(340).courseName("python").courseFee(courseFee2).build();
        Colleges colleges3 = Colleges.builder().collegeName("nit").courseDuration("4 months").accomodation("AC").accomodationFee(200).courseName("spring boot").courseFee(courseFee3).build();
        Colleges colleges4 = Colleges.builder().collegeName("cbit").courseDuration("5 months").accomodation("non-AC").accomodationFee(890).courseName("hibernate").courseFee(courseFee4).build();
        Colleges colleges5 = Colleges.builder().collegeName("mkj").courseDuration("1 months").accomodation("AC").accomodationFee(100).courseName("jdbc").courseFee(courseFee5).build();
        Colleges colleges6 = Colleges.builder().collegeName("Bvrit").courseDuration("2.5 months").accomodation("non-AC").accomodationFee(321).courseName("java").courseFee(courseFee6).build();

        collegesRepository.saveAll(Arrays.asList(colleges1, colleges2, colleges3, colleges4, colleges5, colleges6));

    }

}
