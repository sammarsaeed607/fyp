package com.example.digitallibrarylessonplan2;

public class StudentCources {
    int Attempt_no;
    char grade,emp_no;
    String REG_NO,DISCIPLINE,Course_no,Course_desc,semester_no;

    public int getAttempt_no() {
        return Attempt_no;
    }

    public void setAttempt_no(int attempt_no) {
        Attempt_no = attempt_no;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(char emp_no) {
        this.emp_no = emp_no;
    }

    public String getREG_NO() {
        return REG_NO;
    }

    public void setREG_NO(String REG_NO) {
        this.REG_NO = REG_NO;
    }

    public String getDISCIPLINE() {
        return DISCIPLINE;
    }

    public void setDISCIPLINE(String DISCIPLINE) {
        this.DISCIPLINE = DISCIPLINE;
    }

    public String getCourse_no() {
        return Course_no;
    }

    public void setCourse_no(String course_no) {
        Course_no = course_no;
    }

    public String getCourse_desc() {
        return Course_desc;
    }

    public void setCourse_desc(String course_desc) {
        Course_desc = course_desc;
    }

    public String getSemester_no() {
        return semester_no;
    }

    public void setSemester_no(String semester_no) {
        this.semester_no = semester_no;
    }
}
