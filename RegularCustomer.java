public class RegularCustomer extends Customer{
    private double discount;
    public RegularCustomer(int id, double price, int qty, double disc){
        super(id, price, qty);
        discount=disc;
    }
    public double getDiscount(){
        return discount;
    }
    public double TPDiscount(){
        return (super.totalPrice()-super.totalPrice()*(discount/100));
    }
    public void display(){
        System.out.println("\n- Regular Customer -");
        System.out.println("ID Number: "+getID()+"\nPrice: RM "+getPrice()+"\nQuantity: "+getQty()+"\nDiscount: "+discount/100);
    }

    public int highestQty(int qty) {
        int highest=0;
        for(int i=0;i<4;i++){
            if(super.getQty()>highest){
                highest=super.getQty();
            }
        }
        return highest;
    }
    public double lowestTP(){
        double lowest=9999999.999;
        if(super.totalPrice()<lowest){
            lowest=super.totalPrice();
        }
        return lowest;
    }
}
