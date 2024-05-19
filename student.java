public class student {
    private String name;
    private double test1Mark, test2Mark; //full mark for each test is 30
    public student(){
        name="";
        test1Mark=0;
        test2Mark=0;
    }
    public student (String name, double test1Mark, double test2Mark){
        this.name=name;
        this.test1Mark=test1Mark;
        this.test2Mark=test2Mark;
    }
    public double calcTestMark(double test1Mark, double test2Mark){
        double totTest;
        totTest=((test1Mark/30)*10)+((test2Mark/30)*10);
        return totTest;
    }
}
