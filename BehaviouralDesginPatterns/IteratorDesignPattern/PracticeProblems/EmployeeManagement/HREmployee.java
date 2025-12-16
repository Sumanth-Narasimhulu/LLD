package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

import java.util.List;

public class HREmployee implements Iterator{
    private List<Employee>employees;
    private int index;
    public HREmployee(List<Employee>employees){
        this.employees=employees;
        this.index=0;
    }
    @Override
    public boolean hasNext(){
        return index<employees.size();
    }
    @Override
    public Employee next(){
        return employees.get(index++);
    }
    
}
