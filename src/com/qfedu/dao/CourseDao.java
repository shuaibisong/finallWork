package com.qfedu.dao;


import com.qfedu.entity.Course;

import java.util.List;

public interface CourseDao {
    public List<Course> selectAll(int pageNo ,int PageSize);
    public int getCount();
    public int delete(int id);
    public int insert(String cname, String cteacher,int ccredit);
    public List<Course> selectByCname(String cname);
    public int update(String cname, String cteacher,int ccredit,int cno);

}
