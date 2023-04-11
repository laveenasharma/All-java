package EmployeeManagement;

public class SalesEmployee extends EmployeeDetail {
    private int Target;
    private String Deadline;
    private int Conversion;

    SalesEmployee(String name, int id, String phn, String joinDate, int sal){
        super(name, id, phn, joinDate, sal);
        
    }

    public int getTarget() {
        return Target;
    }

    public void setTarget(int target) {
        Target = target;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        Deadline = deadline;
    }

    public int getConversion() {
        return Conversion;
    }

    public void setConversion(int conversion) {
        Conversion = conversion;
    }

    public String Performance(){
        if(getConversion()>getTarget()){
            return "Excellent!! Target over achieved";
        }
        else if(getConversion()==getTarget()){
            return "Target Achieved";
        }
        else {
        return "Underperformed.";
        }
    }

}
