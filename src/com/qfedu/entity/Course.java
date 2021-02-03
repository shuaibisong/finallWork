package com.qfedu.entity;

public class Course {
  private int cno;
  private String cname;
  private String cteacher;
  private int ccredit;

    public Course() {
    }

    public Course(int cno, String cname, String cteacher, int ccredit) {
        this.cno = cno;
        this.cname = cname;
        this.cteacher = cteacher;
        this.ccredit = ccredit;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", cteacher='" + cteacher + '\'' +
                ", ccredit=" + ccredit +
                '}';
    }
}
