package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn python", "in28minutes"),
                new Course(2, "Learn Java", "in28minutes"),
                new Course(3, "Learn oracle1", "in28minutes")
        );
    }
}
