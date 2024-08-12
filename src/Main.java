import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Student student = new Student();
       //student.entroll();
       //student.payTuition(300);

        System.out.print("Please enter the number of student for entroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();

        Student[] students = new Student[numOfStudent];

        for(int i=0; i<numOfStudent; i++){
            students[i]=new Student();
            students[i].entroll();
            System.out.print("Please enter the tuition amount: ");
            students[i].payTuition(sc.nextFloat());
            students[i].toString();
        }


    }
}