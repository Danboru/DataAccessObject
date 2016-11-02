package DataAccessObject;

import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();

    public void addStudent(Student student);

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
