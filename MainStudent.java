import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        student stud = new student();

        String name;
        double test1Mark, test2Mark, totTest;

        System.out.print("Name : ");
        name=input.nextLine();
        System.out.print("Test 1 Mark : ");
        test1Mark=input.nextDouble();
        System.out.print("Test 2 Mark : ");
        test2Mark=input.nextDouble();

        stud = new student(name,test1Mark,test2Mark);
        totTest = stud.calcTestMark(test1Mark,test2Mark);

        System.out.println("\nName: "+name);
        System.out.println("Mark: "+totTest);

        if(totTest>=10){
            System.out.println("Total test: Pass");
        }
        else{
            System.out.println("Total test: Fail");
        }
    }
}