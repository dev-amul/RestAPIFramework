package com.API_Testing.payloadpojo;

public class StudentData {
    private int rollNumber;
    private String name;
    private String address;
    private String admissionDate;
    private String joinClass;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getJoinClass() {
        return joinClass;
    }

    public void setJoinClass(String joinClass) {
        this.joinClass = joinClass;
    }
}
