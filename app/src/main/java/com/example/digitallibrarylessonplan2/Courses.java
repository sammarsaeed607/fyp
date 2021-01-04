package com.example.digitallibrarylessonplan2;

public class Courses {
    String course_no, course_desc, course_title;

    public Courses(String course_no, String course_desc, String course_title) {
        this.course_no = course_no;
        this.course_desc = course_desc;
        this.course_title = course_title;
    }

    public String getCourse_no() {
        return course_no;
    }

    public void setCourse_no(String course_no) {
        this.course_no = course_no;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }
}
