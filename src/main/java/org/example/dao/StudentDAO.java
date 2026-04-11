package org.example.dao;

import org.example.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {

    void addStudent(Student student) throws SQLException;

    void updateStudent(int id, String email, String phone) throws SQLException;

    void deleteStudent(int id) throws SQLException;

    List<Student> getAllStudents() throws SQLException;
}
