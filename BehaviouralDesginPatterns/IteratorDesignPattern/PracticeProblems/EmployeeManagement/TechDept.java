package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

public class TechDept implements EmployeeCollection{
    private Employee[]employees;
    public TechDept(){
        this.employees=new Employee[3];
        employees[0]=new Employee("David",201,"Tech");
        employees[1]=new Employee("Eve",202,"Tech");
        employees[2]=new Employee("Frank",203,"Tech");
    }
    @Override
    public Iterator createIterator(){
        return new TechEmployee(employees);
    }
    
}
