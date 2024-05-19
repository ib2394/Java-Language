public class ArithmeticV1 {
    private double num1;
    private double num2;

    public ArithmeticV1(){
        num1=0;
        num2=0;
    }
    public void ArithmeticV1(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double getAddition(double num1, double num2){
        return num1+num2;
    }
    public double getMultiplication(double num1, double num2){
        return num1*num2;
    }
    public double getSubstraction(double num1, double num2){
        return num1-num2;
    }
    public double getDivition(double num1, double num2){
        return num1/num2;
    }

}
