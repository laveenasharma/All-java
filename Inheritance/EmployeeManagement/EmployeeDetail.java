package EmployeeManagement;

public class EmployeeDetail {
    private String empName;
    private int empId;
    private String contact;
    private String joiningDate;
    private int salary;

    public EmployeeDetail(String name, int id, String phn, String joinDate,int sal){
        this.empName=name;
        this.empId=id;
        this.contact=phn;
        this.joiningDate=joinDate;
        this.salary=sal;
        

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
