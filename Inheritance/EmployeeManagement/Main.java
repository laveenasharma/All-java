package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        TechEmployee T1= new TechEmployee("Laveena", 101,"98987898", "1st April",456765);
        T1.setShift(0);
        T1.setTechSkills("Java");

        System.out.println(T1.getEmpName());
        System.out.println(T1.getEmpId());
        System.out.println(T1.getContact());
        System.out.println(T1.getJoiningDate());
        System.out.println(T1.getSalary());
        System.out.println(T1.getShift());
        System.out.println(T1.getTechSkills());

        SalesEmployee s1= new SalesEmployee("Lalit", 102, "89765849", "4March", 783492493);

        s1.setConversion(110);
        s1.setTarget(100);
        s1.setDeadline("30 April");
        System.out.println(s1.getEmpName());
        System.out.println(s1.getEmpId());
        System.out.println(s1.getContact());
        System.out.println(s1.getJoiningDate());
        System.out.println(s1.getSalary());
        System.out.println(s1.getTarget());
        System.out.println(s1.getConversion());
        System.out.println(s1.getDeadline());
        System.out.println("Your Performance is " +s1.Performance());
    }
}
