package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

public class TechEmployee implements Iterator{
    private Employee[] employees;
    private int index;
    public TechEmployee(Employee[]employees){
        this.employees=employees;
        this.index=0;
    }
    @Override
    public boolean hasNext(){
        return index<employees.length;
    }
    
    @Override
    public Employee next(){
        return employees[index++];
    }
}
