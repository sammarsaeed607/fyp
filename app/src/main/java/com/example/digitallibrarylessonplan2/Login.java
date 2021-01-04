package com.example.digitallibrarylessonplan2;

public class Login {

    String emp_no,emp_firstname,emp_middle,emp_lastname,email,status,Password;
    int id;
    String Reg_No,SName,LsnName,StrtTime;

    public Login(String emp_no, String emp_firstname, String emp_middle, String emp_lastname, String email, String status, String password) {
        this.emp_no = emp_no;
        this.emp_firstname = emp_firstname;
        this.emp_middle = emp_middle;
        this.emp_lastname = emp_lastname;
        this.email = email;
        this.status = status;
        Password = password;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(String emp_firstname) {
        this.emp_firstname = emp_firstname;
    }

    public String getEmp_middle() {
        return emp_middle;
    }

    public void setEmp_middle(String emp_middle) {
        this.emp_middle = emp_middle;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReg_No() {
        return Reg_No;
    }

    public void setReg_No(String reg_No) {
        Reg_No = reg_No;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getLsnName() {
        return LsnName;
    }

    public void setLsnName(String lsnName) {
        LsnName = lsnName;
    }

    public String getStrtTime() {
        return StrtTime;
    }

    public void setStrtTime(String strtTime) {
        StrtTime = strtTime;
    }
}