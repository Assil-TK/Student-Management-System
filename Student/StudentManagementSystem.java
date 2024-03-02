import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>(); }

    public void addStudent(Student student) {
        students.add(student); }

    public void removeStudent  (int roll) {
        for (Student student : students) {
            if (student.getRollNumber()== roll) {
                students.remove(student);
                break;
            }
        }
    }

    public Student searchStudent(int roll) {
        for (Student student : students) {
            if (student.getRollNumber() == roll) {
                return student;  }
        }

        return null ;


    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student); }
    }



}
