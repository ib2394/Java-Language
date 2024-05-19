import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idNum, qty, size = 4, highest = 0, index = 0;
        double price, disc, lowest = 99999;

        //Customer
        /**System.out.print("\n-Customer- \nID Number: ");
         idNum=input.nextInt();
         System.out.print("Price: RM ");
         price=input.nextDouble();
         System.out.print("Quantity: ");
         qty=input.nextInt();
         Customer C = new Customer(idNum, price, qty);**/

        //Regular Customer
        System.out.print("\n-Regular Customer-");
        RegularCustomer[] R = new RegularCustomer[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("\n" + i + ". ID Number: ");
            idNum = input.nextInt();
            System.out.print("Price: RM ");
            price = input.nextDouble();
            System.out.print("Quantity: ");
            qty = input.nextInt();
            System.out.print("Discount: ");
            disc = input.nextDouble();
            R[i] = new RegularCustomer(idNum, price, qty, disc);
        }
        System.out.println("\nHighest Quantity:-");
        for (int i =0; i<4; i++){
            if (R[i].getQty() > highest){
                highest = R[i].getQty();
            }
        }
        System.out.print(highest + "\n");
        System.out.println("\nLowest Price after Discount:-");
        for (int i =0; i<4; i++){
            if (R[i].TPDiscount()<lowest){
                lowest=R[i].getDiscount();
                index=i;
            }
        }
        R[index].display();
        System.out.print("\nPrice after Discount: RM" + R[index].TPDiscount());

        System.out.println("\nQuantity more than 10: ");
        for (int i =0; i<4; i++){
            if (R[i].getQty()>10) {
                R[i].display();
            }
        }
    }
}