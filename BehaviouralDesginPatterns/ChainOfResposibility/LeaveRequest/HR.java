package BehaviouralDesginPatterns.ChainOfResposibility.LeaveRequest;

public class HR extends Approver{
    @Override
    public void processRequest(int days) {
        if(days <=20){
            System.out.println("Your leave request has been approved by HR");
        }else{
            System.out.println("Rejected as per company policy");
        }
    }
}
