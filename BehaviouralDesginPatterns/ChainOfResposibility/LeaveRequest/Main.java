package BehaviouralDesginPatterns.ChainOfResposibility.LeaveRequest;

import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver hr = new HR();
        supervisor.nextApprover = manager;
        manager.nextApprover = director;
        director.nextApprover = hr;

        supervisor.processRequest(2);
        manager.processRequest(1);
        director.processRequest(3);
        supervisor.processRequest(30);
    }
}
