package com.qfedu.test;

import com.qfedu.dao.impl.CourseDaoimpl;

import com.qfedu.entity.Course;
import com.qfedu.service.impl.CourseServiceImpl;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        CourseServiceImpl courseService = new CourseServiceImpl();
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        List<Course> select = courseService.selectByCname("dili");
        System.out.println(select.size());
    }
}