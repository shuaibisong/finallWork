package com.qfedu.dao.impl;

import com.qfedu.dao.CourseDao;
import com.qfedu.entity.Course;
import com.qfedu.util.BaseDaoNew;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class CourseDaoimpl implements CourseDao {

    @Override
    public List<Course> selectAll(int pageNo,int pageSize) {
        String sql="select * from course limit ?,?";
        List<Course> select = null;
        Object[] objects={(pageNo - 1) * pageSize,pageSize};
        try {
            select = BaseDaoNew.select(sql, objects, Course.class);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return select;
    }

    @Override
    public int getCount() {
     String sql="select * from course";
        try {
            List<Course> select = BaseDaoNew.select(sql, null, Course.class);
            return select.size();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
           return 0;
    }

    @Override
    public int delete(int id) {
        String sql="delete from course where cno=?";
        Object[] objects={id};
        try {
            int update = BaseDaoNew.update(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return 0;
    }

    @Override
    public int insert( String cname, String cteacher, int ccredit) {
        String sql="insert into course(cname,cteacher,ccredit) values(?,?,?)";
        Object[] objects={cname,cteacher,ccredit};
        try {
            int update = BaseDaoNew.update(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Course> selectByCname(String cname) {
        String sql="select * from course where cname=?";
        Object[] objects={cname};
        try {
            List<Course> select = BaseDaoNew.select(sql, objects, Course.class);
            return select;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int update(String cname, String cteacher, int ccredit,int cno) {
        String sql="update course set cname=?,cteacher=?,ccredit=? where cno=?";
        Object[] objects={cname,cteacher,ccredit,cno};
        try {
            int update = BaseDaoNew.update(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return 0;
    }


}
