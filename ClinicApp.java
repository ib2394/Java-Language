import java.util.*;
import java.util.Scanner;
public class ClinicApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name,ward,medicineCode,medicineType,medicineName;
        double medicinePrice;

        Patient p[] = new Patient[4];
        for(int i=1;i<=4;i++){
            System.out.print("\nPatient "+i);
            //input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.print("\nEnter Patient Name: ");
            name=input.nextLine();
            System.out.print("Enter Patient Ward: ");
            ward=input.nextLine();
            System.out.print("Enter Madicine Code: ");
            medicineCode=input.nextLine();
            System.out.print("Enter Madicine Type: ");
            medicineType=input.nextLine();
            System.out.print("Enter Madicine Name: ");
            medicineName=input.nextLine();
            System.out.print("Enter Madicine Price: RM");
            medicinePrice=input.nextDouble();

            p[i]=new Patient();
            p[i].setPatient(name,ward,new Medicine(medicineCode,medicineType,medicineName,medicinePrice));
        }

    }
}