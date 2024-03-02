public class Student {

    private String name ;
    private int roll;
    private String grade;

    public Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public int getRollNumber() {
        return roll;
    }

    public void setRollNumber(int roll) {
        this.roll = roll;
    }


    public String getGrade() {
        return grade ;
    }

    public void setGrade(String grade) {
        this.grade =grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +", rollNumber=" + roll + ", grade='" + grade + '\'' +'}';
    }
}
