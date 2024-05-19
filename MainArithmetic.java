import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2, total;
        System.out.print("Enter number 1: ");
        num1=input.nextDouble();
        System.out.print("Enter number 2: ");
        num2=input.nextDouble();

        ArithmeticV1 calc = new ArithmeticV1();

        System.out.println("\nTotal Addition      : "+calc.getAddition(num1, num2));
        System.out.println("Total Multiplication: "+calc.getMultiplication(num1, num2));
        System.out.println("Total Substraction  : "+calc.getSubstraction(num1, num2));
        System.out.println("Total Divition      : "+calc.getDivition(num1, num2));
    }
}