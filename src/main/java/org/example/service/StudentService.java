package org.example.service;

import org.example.model.Student;

import java.sql.SQLException;

public interface StudentService {
    void createStudent(Student student) throws SQLException;

    void updateStudent(int id, String email) throws SQLException;

    void deleteStudent(int id) throws SQLException;

    void getAllStudent() throws SQLException;
}
