package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class HRDept implements EmployeeCollection{
    private List<Employee>employees;
    public HRDept(){
        this.employees=new ArrayList<>();
        employees.add(new Employee("Alice",101,"HR"));
        employees.add(new Employee("Bob",102,"HR"));
        employees.add(new Employee("Charlie",103,"HR"));
    }
    @Override
    public Iterator createIterator(){
        return new HREmployee(employees);
    }
    
}
