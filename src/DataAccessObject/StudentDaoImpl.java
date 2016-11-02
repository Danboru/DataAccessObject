package DataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

//list is working as a database 
    List<Student> students = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {

        students.add(student);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());

        System.out.println("Student: Roll No " + student.getRollNo() + ", "
                + "deleted from database");

    }

//retrive list of students from the database
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
