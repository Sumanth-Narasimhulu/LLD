package BehaviouralDesginPatterns.IteratorDesignPattern.PracticeProblems.EmployeeManagement;

public class Iterate {

    public static void iterateEmployees(EmployeeCollection collection) {
        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.toString());
        }
    }
    
}
