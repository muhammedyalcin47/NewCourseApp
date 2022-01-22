package com.bilgeadam.newcourseapp.controller;

import com.bilgeadam.newcourseapp.entity.Course;
import com.bilgeadam.newcourseapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class CourseController {


    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable("courseId") long id)
    {
        Course course = null;
       Optional<Course> courseDB =  courseRepository.findById(id);

       if (courseDB.isPresent())
       {
           course = courseDB.get();
       }
       return course;
    }

    


}
