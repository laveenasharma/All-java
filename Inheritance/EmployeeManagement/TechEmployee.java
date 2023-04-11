package EmployeeManagement;

public class TechEmployee extends EmployeeDetail{
    private int shift;
    private String TechSkills;

    TechEmployee(String name, int id, String phn, String joinDate,int sal){
        super(name,id, phn,joinDate,sal);
    }

    public String getShift() {
        if(shift==1){
            return "Night";
        }
        else if(shift==0){
            return "Day";
        }
        else{
        return "Invalid Input";
        }
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getTechSkills() {
        return TechSkills;
    }

    public void setTechSkills(String techSkills) {
        TechSkills = techSkills;
    }
    
}
