package com.company;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private long phoneNumber;
    private String email;
    private long grossSalary;

    public NhanVien(String id, String name, int age, long phoneNumber, String email, long grossSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.grossSalary = grossSalary;
    }

    public NhanVien() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(long grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + phoneNumber + " - " + email + " - " + grossSalary;
    }
}
