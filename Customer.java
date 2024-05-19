public class Customer {
    private int idNum;
    private double price;
    private int quantity;

    public Customer(int id, double Price, int qty){
        idNum=id;
        price=Price;
        quantity=qty;
    }
    public int getID(){
        return idNum;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return quantity;
    }
    public void display(){
        System.out.println("\n- Customer - ");
        System.out.println("ID Number: "+idNum+"\nPrice: RM"+price+"\nQuantity: "+quantity);
    }
    public double totalPrice(){
        return price*quantity;
    }
}
