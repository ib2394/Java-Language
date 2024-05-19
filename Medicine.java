class Medicine{
    private String medicineCode;
    private String medicineType;
    private String medicineName;
    private double medicinePrice;

    public Medicine(){
        medicineCode=null;
        medicineType=null;
        medicineName=null;
        medicinePrice=0.0;
    }


    public Medicine(String medCode, String medType, String medName, double medPrice){
        medicineCode=medCode;
        medicineType=medType;
        medicineName=medName;
        medicinePrice=medPrice;
    }

    public void setMedic(String medCode, String medType, String medName, double medPrice){
        medicineCode=medCode;
        medicineType=medType;
        medicineName=medName;
        medicinePrice=medPrice;

    }
    public String getMedicineCode(){
        return medicineCode;
    }
    public String getMedicineType(){
        return medicineType;
    }
    public String getMedicineName(){
        return medicineName;
    }
    public double getMedicinePrice(){
        return medicinePrice;
    }
    public String toString(){
        return ("Code: "+medicineCode+"Type: "+medicineType+"Name: "+medicineName+"Price: RM"+medicinePrice);
    }
}
