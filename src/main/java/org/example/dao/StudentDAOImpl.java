package org.example.dao;
import org.example.model.Student;
import org.example.util.dbConnection;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class StudentDAOImpl implements StudentDAO {


    @Override
    public void addStudent(final Student student) throws SQLException{
        try{
                String sql = "insert into student(id, name, email, phone, course) values(?, ?, ?, ?, ?)";
                Connection connection = dbConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, student.getId());
                preparedStatement.setString(2, student.getName());
                preparedStatement.setString(3, student.getEmail());
                preparedStatement.setInt(4, student.getPhone());
                preparedStatement.setString(5, student.getCourse());
                preparedStatement.execute();
                System.out.println("Record added succesfullly ");
            }catch (Exception ex){

            }
        }



    @Override
        public void updateStudent(int id, String email, String phone) throws SQLException {
            String sql = "update student set email = ? where stud_id= ?";
            Connection connection = dbConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, id);

            int updatedRowCount = preparedStatement.executeUpdate();
            System.out.println("Update Successfull : Rows Count : "+ updatedRowCount);
        }

        @Override
        public void deleteStudent(int id) throws SQLException {
            String sql = "delete from student where stud_id = ?";
            Connection connection = dbConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int deletedRowCount = preparedStatement.executeUpdate();
            System.out.println("Delete Successfull : Rows Count : "+ deletedRowCount);
        }
        @Override
        public void getAllStudent() throws SQLException {
            String sql = "select * from student";
            Connection connection = dbConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("Employee List:  ");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("stud_id") + "  | "
                        + resultSet.getString("name") + " | "
                        + resultSet.getString("email") + " | "
                        + resultSet.getString("phone") + " | "
                        + resultSet.getString("course") + " | "
                );
            }

        }

    }
