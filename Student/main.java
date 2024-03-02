import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        boolean go = true;
        while (go) {

            System.out.println("Student Management System");
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Search Student");
            System.out.println("4 Display All Students");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            
            
            switch (choice) {
                case 1:

                    System.out.print("Student name: ");
                    scanner.nextLine() ; 
                    String name = scanner.nextLine();
                    System.out.print("Studentt roll number: ");
                    
                    int roll = scanner.nextInt();
                    System.out.print("Student grade: ");
                    String grade= scanner.next();
                    system.addStudent (new Student(name,roll,grade));
                    break;


                case 2 :
                    System.out.print("Enter roll number of student to remove: ");
                    int removeRoll= scanner.nextInt();
                    system.removeStudent(removeRoll);
                    
                    break ;



                case 3:

                    System.out.print("Enter roll number of student to search: ");

                    int searchRoll= scanner.nextInt() ;
                    Student SD = system.searchStudent(searchRoll);
                    if (SD !=null) {
                        System.out.println("Student found: " +SD);
                    } 
                    else {
                        System.out.println("Student not found.");}


                    break;


                case 4:
                    system.displayAllStudents();
                    break;


                case 5:
                    go = false;
                    break;


                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 5"); }
        }

        
        scanner.close() ;
    }


}
