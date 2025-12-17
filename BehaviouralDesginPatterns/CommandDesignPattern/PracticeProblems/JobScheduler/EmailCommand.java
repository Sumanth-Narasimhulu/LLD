package BehaviouralDesginPatterns.CommandDesignPattern.PracticeProblems.JobScheduler;

public class EmailCommand implements Command{
    private EmailJob email;
    public EmailCommand(EmailJob email){
        this.email = email;
    }
    public void execute(){
        email.sendEmail();
    }
}
