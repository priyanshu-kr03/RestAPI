package com.springrest.springrest.services;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course> courseList;

    public CourseServiceImpl() {
        courseList = new ArrayList<>();
        courseList.add(new Course(125, "Java", "This course contains basic of java"));
        courseList.add(new Course(126, "C++", "This course contains basic of C++"));
    }

    @Override
    public List<Course> getCourses() {
        return courseList;
    }

    @Override
    public Course getCourse(long courseId) {
        Course course=null;
        for(Course course1:courseList) {
            if(course1.getId()==courseId) {
                course=course1;
                break;
            }
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        courseList.add(course);
        return course;
    }
}
