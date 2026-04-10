package org.example.service;

import org.example.model.Student;

import java.sql.SQLException;

public interface StudentService {
    void addStudent(Student student) throws SQLException;

    void updateStudent(int id, String email, String phone) throws SQLException;

    void deleteStudent(int id) throws SQLException;

    void getAllStudent() throws SQLException;
}
