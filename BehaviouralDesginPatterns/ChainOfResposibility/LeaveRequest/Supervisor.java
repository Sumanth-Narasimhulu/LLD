package BehaviouralDesginPatterns.ChainOfResposibility.LeaveRequest;

public class Supervisor extends Approver {

    @Override
    public void processRequest(int days) {
        if(days <= 3){
            System.out.println("Leave Request has been approved by Supervisor");
        }else if(nextApprover != null){
            nextApprover.processRequest(days);
        }
    }
}
