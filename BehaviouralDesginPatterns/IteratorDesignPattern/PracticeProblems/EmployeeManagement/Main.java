package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeCollection HRDepartment = new HRDept();
        EmployeeCollection TechDept = new TechDept();
        Iterate iter = new Iterate();
        iter.iterateEmployees(HRDepartment);
        iter.iterateEmployees(TechDept);

        
    }
}
