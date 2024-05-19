public class Patient {
    private String patientName;
    private String patientWard;
    private Medicine med;

    public Patient(){
        patientName=null;
        patientWard=null;
        med = new Medicine();
    }
    public void setPatient(String name, String ward,Medicine medic){
        patientName=name;
        patientWard=ward;
        med=medic;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getPatientWard(){
        return patientWard;
    }
    public Medicine getMed(){
        return med;
    }
    public String toString(){
        return ("Patient Name: "+patientName+"\nPatient Ward: "+patientWard);
    }
}
