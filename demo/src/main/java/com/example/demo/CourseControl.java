package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseControl {
    @RequestMapping("/courses")
    public List<Course> courses(){
        return Arrays.asList(
                new Course(1,"learn"),
                new Course(2,"dsa"),
                new Course(3,"springboot"),
                new Course(4,"java")


        );
    }
}
