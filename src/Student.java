import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String cources="";
    private float tuitionBalance=0;
    private float costOfCourse=600;
    private static int id=100;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeYear = "1";
        this.studentID = "" + id;
        id++;
    }
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first name: ");
        this.firstName=sc.nextLine();
        System.out.print("Please enter last name: ");
        this.lastName=sc.nextLine();
        System.out.print("Please enter grade year(1,2,3 or 4): ");
        this.gradeYear=sc.nextLine();

        setStudentID();
        System.out.println(firstName+" "+lastName+" : "+gradeYear+" "+studentID);

    }

    public void setStudentID(){
        id++;
        this.studentID=gradeYear+id;
    }

    public void entroll(){
        do {
            System.out.print("Please enter your cources(q for quit): ");
            Scanner sc = new Scanner(System.in);
            String cource = sc.nextLine();
            if (!cource.equals("q")) {
                cources = this.cources + "\n" + cource;
                tuitionBalance=tuitionBalance+costOfCourse;
            } else {
                break;
            }
        }while(true);
        System.out.println("Entroll in: "+cources);
        //System.out.println("Tuition Balance: "+tuitionBalance);
    }
    public void viewBalance(){
        System.out.println("Your balance is: "+tuitionBalance);
    }
    public void payTuition(float amount){
        viewBalance();
        tuitionBalance-=amount;
        System.out.println("Thank you for your payment for "+amount);
        viewBalance();
    }

    public String toString(){
        return "First name: "+firstName+"\nLast name: "+lastName+"\nGrade year: "+gradeYear+"\nStudent ID: "+studentID;
    }

}
