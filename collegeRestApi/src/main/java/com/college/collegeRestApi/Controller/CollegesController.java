package com.college.collegeRestApi.Controller;



import com.college.collegeRestApi.Service.CollegesService;
import com.college.collegeRestApi.models.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegesController {


    @Autowired
    private CollegesService collegesService;


    @GetMapping("/fetch-all-colleges")
    public ResponseEntity<List<Colleges>> fetchAll(){
        List<Colleges> colleges = collegesService.fetchAll();
        return  ResponseEntity.status(HttpStatus.OK).body(colleges);
    }

    @GetMapping("/fetch-By-courseName/{courseName}")
    public ResponseEntity<List<Colleges>> findByCourseName(@PathVariable("courseName") String courseName){
        List<Colleges> colleges =collegesService.findByCourse(courseName);
        return ResponseEntity.ok(colleges);
    }

}
