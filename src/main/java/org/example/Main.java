package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;
import org.example.util.DBConnection;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws SQLException {

        DBConnection.getConnection();
        System.out.println("connection Success");

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();
        int choice;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. Get All Students");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    System.out.print("Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Email: ");
                    s.setEmail(sc.nextLine());

                    System.out.print("Phone: ");
                    s.setPhone(sc.nextLine());

                    System.out.print("Course: ");
                    s.setCourse(sc.nextLine());

                    service.addStudent(s);
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Email: ");
                    String email = sc.nextLine();

                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();

                    service.updateStudent(updateId, email, phone);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    service.deleteStudent(id);
                    break;
                case 4:
                    List<Student> students = service.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("---- Student List ----");
                        for (Student st : students) {
                            System.out.println(st.getId() + " | " + st.getName() +
                                    " | " + st.getEmail() + " | " +
                                    st.getPhone() + " | " + st.getCourse());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit ");
                    System.exit(0);

            }
        } while(choice!=5);
           System.out.println("Invalid choice!");

    }
}