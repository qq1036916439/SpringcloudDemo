package com.zzq.entity;

public class Student {
    private Integer stuId;

    private String name;

    private Integer sex;

    public Student(Integer stuId, String name, Integer sex, String phone, Integer status, String depart) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.status = status;
        this.depart = depart;
    }

    private String phone;

    private Integer status;

    private String depart;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }
}