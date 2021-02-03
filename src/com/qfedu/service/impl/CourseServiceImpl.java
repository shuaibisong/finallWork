package com.qfedu.service.impl;

import com.qfedu.dao.impl.CourseDaoimpl;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    @Override
    public List<Course> selectAll(int pageNo ,int pageSize) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        List<Course> courses = courseDaoimpl.selectAll(pageNo, pageSize);
        return courses;

    }

    @Override
    public int getCount() {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        int count = courseDaoimpl.getCount();
        return count;
    }

    @Override
    public int delete(int id) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        int delete = courseDaoimpl.delete(id);
        return delete;
    }

    @Override
    public int insert(String cname, String cteacher, int ccredit) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        int insert = courseDaoimpl.insert(cname, cteacher, ccredit);
        return insert;
    }

    @Override
    public List<Course> selectByCname(String cname) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        List<Course> courses = courseDaoimpl.selectByCname(cname);
        return courses;
    }

    @Override
    public int update(String cname, String cteacher, int ccredit, int cno) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        int update = courseDaoimpl.update(cname, cteacher, ccredit, cno);
        return update;
    }
}
