class Product {
    //data members\attributes
    private String productName;
    private int age;
    private double stockPrice;
    private int qtyLeft;

    //normal constructor

    public Product(String pN, int A, double sP, int qL) {
        productName = pN;
        age = A;
        stockPrice = sP;
        qtyLeft = qL;
    }

    public String getProductName() { //accessor method
        return productName;
    }

    public int getAge() {
        return age;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public int getQtyLeft() {
        return qtyLeft;
    }

    public String toString() {
        return ("Product name: "+productName+"Age started (months): "+age+"Stock Price: RM "+stockPrice+"Quantity left: "+qtyLeft);
    }

    public double calculateSellingPrice(String productName) {
        double sellingPrice=0.0;
        if (productName.contains("Puree")){
            sellingPrice = 1.5*stockPrice;
        }
        else if (productName.contains("Banana Cereal")){
            sellingPrice = 1.45*stockPrice;
        }
        else if (productName.contains("Chicken Powder")){
            sellingPrice = 1.35*stockPrice;
        }
        return sellingPrice;
    }
}