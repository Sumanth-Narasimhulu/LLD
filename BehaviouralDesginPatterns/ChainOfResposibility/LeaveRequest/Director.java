package BehaviouralDesginPatterns.ChainOfResposibility.LeaveRequest;

public class Director extends Approver {

    @Override
    public void processRequest(int days) {
        if(days <=10){
            System.out.println("Leave Request has been approved by Director");
        }else if(nextApprover != null){
            nextApprover.processRequest(days);
        }
    }
}
