package org.example.service;

import org.example.dao.StudentDAO;
import org.example.dao.StudentDAOImpl;
import org.example.model.Student;

import java.sql.SQLException;

public class StudentServiceImpl implements StudentService{

    @Override
    public void createStudent(final Student student) throws SQLException {
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.createStudent(student);

    }

    @Override
    public void updateStudent(int id, String email) throws SQLException {
        StudentDAO studentDAO=new StudentDAOImpl();
        studentDAO.updateStudent(id, email);
    }

    @Override
    public void deleteStudent(int id) throws SQLException {
        StudentDAO studentDAO=new StudentDAOImpl();
        studentDAO.deleteStudent(id);
    }

    @Override
    public void getAllStudent() throws SQLException {
        StudentDAO studentDAO=new StudentDAOImpl();
        studentDAO.getAllStudent();
    }

}
