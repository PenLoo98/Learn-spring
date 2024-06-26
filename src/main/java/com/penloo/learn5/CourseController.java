package com.penloo.learn5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // Course: id, name, author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1, "Learn AWS", "penloo"),
            new Course(2, "Learn DevOps", "penloo"),
            new Course(3, "Learn React", "penloo")
        );
    }
}
