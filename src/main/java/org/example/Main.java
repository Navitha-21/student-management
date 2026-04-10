package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;
import org.example.util.dbConnection;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws SQLException {

        dbConnection.getConnection();
        System.out.println("connection Success");

        Student student=new Student();
        student.setId(67);
        student.setName("Navitha");
        student.setEmail("navitha21@gmail.com");
        student.setPhone(799306690);
        student.setCourse("Java Full Stack");

        StudentService studentService = new StudentServiceImpl();
        studentService.createStudent(student);
        studentService.updateStudent(67, "adhoni04@gmail.com");
        studentService.deleteStudent(68);
        studentService.getAllStudent();

    }
}