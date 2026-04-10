package org.example.dao;

import org.example.model.Student;

import java.sql.SQLException;

public interface StudentDAO {
    void createStudent(Student student) throws SQLException;

    void updateStudent(int id, String email) throws SQLException;

    void deleteStudent(int id) throws SQLException;

    void getAllStudent() throws SQLException;
}
