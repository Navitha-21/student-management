package org.example.model;

public class Student {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String course;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }

}
