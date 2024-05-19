import java.util.*;
public class Main {
    public static void main(String[] args) {
        int age=0, qtyLeft=0;
        double stockPrice=0.0,grossProfit;
        String productName=" ";

        //Question 2 (b)(i)
        //read input
        Scanner input = new Scanner(System.in);
        //create object, store all data into the object
        Product prod = new Product(productName,age,stockPrice,qtyLeft);

        System.out.print("\nProduct name: ");
        productName = input.nextLine();
        System.out.print("Age started(months): ");
        age = input.nextInt();
        System.out.print("Stock Price: RM");
        stockPrice = input.nextDouble();
        System.out.print("Quantity left:  ");
        qtyLeft = input.nextInt();

        //(b)(ii)
        if(prod.getQtyLeft()<50){//ambil from class product sbb dekat main, data akan bertukar tukar tapi kalau dekat class dia fix dh
            System.out.println("The product is: "+prod.toString());
        }

        //(b)(iii)
        grossProfit=(prod.calculateSellingPrice(productName)*prod.getQtyLeft())-(prod.getStockPrice()*prod.getQtyLeft());
        System.out.print("Gross Profit: "+grossProfit);

        //(b)(iv)
        if(prod.getAge()<7){
            System.out.print("Product Name for baby above than 7 months: \n"+prod.getProductName());
        }
    }
}