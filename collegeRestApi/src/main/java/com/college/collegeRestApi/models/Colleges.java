package com.college.collegeRestApi.models;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Colleges {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    private UUID collegeId;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "course_name")
    private String courseName;

    @Column(name="course_duration")
    private String courseDuration;


    private String accomodation;

    @Column(name = "accomodation_fee")
    private long accomodationFee;


    @OneToOne(targetEntity = CourseFee.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "courseFee-ref-id",referencedColumnName = "courseFee_id")
    private CourseFee courseFee;
}
