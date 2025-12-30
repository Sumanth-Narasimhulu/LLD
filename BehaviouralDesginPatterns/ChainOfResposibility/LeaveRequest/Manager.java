package BehaviouralDesginPatterns.ChainOfResposibility.LeaveRequest;

public class Manager extends Approver {

    @Override
    public void processRequest(int days) {
        if(days <=5){
            System.out.println("Leave Request has been approved by manager");
        }else if(nextApprover != null){
            nextApprover.processRequest(days);
        }
    }
}
