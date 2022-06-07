import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
    
    private String name;
    private String number;
    private String major;
    private String grade;
    private String date;
    private String phone;
    private String address;
    private String picture;
    private String profile;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    public Student(String name, String number, String major, String grade, String date, String phone, String address, String picture, String profile)
    {
        this.name = name;
        this.number = number;
        this.major = major;
        this.grade = grade;
        this.date = date;
        this.phone = phone;
        this.address = address;
        this.picture = picture;
        this.profile = profile;
    }
    
    public void updateStudent(String name, String number, String major, String grade, String date, String phone, String address, String picture, String profile)
    {
        this.name = name;
        this.number = number;
        this.major = major;
        this.grade = grade;
        this.date = date;
        this.phone = phone;
        this.address = address;
        this.picture = picture;
        this.profile = profile;
    }
    
    public String information()
    {
        String information = "";
        information += "● 이름 : " + this.getName() + "\n";
        information += "● 학번 : " + this.getNumber() + "\n";
        information += "● 학과 : " + this.getMajor() + "\n";
        information += "● 학년 : " + this.getGrade() + "\n";
        information += "● 생년월일 : " + this.getDate() + "\n";
        information += "● 연락처 : " + this.getPhone() + "\n";
        information += "● 주소 : " + this.getAddress() + "\n";
        information += "● 사진 : " + this.getPicture() + "\n";
        information += "● 프로필 : " + this.getProfile();
        return information;
    }
}
