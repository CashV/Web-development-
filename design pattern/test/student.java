package test;
//this is the telescopic constructor
public class student {
    private String fName;
    private String lName;
    private String Weight;

    public void setFname (String fName){
        this.fName = fName;
    }
    public String getFName(){
        return fName;
    }
    public void setLname(String fName, String lName){
        this.setFname(fName);
        this.lName = lName;
    }
    public String getLName(){
        return lName;
    }
    
    public void setWeight(String fname, String lName, String Weight){
        this.setLname(fname, lName);
        this.Weight = Weight;
    }
    public String getWeight(){
        return Weight;
    }

}
