package BehaviouralDesginPatterns.CommandDesignPattern.PracticeProblems.JobScheduler;

public class Main {
    public static void main(String[] args) {
        EmailJob emailJob = new EmailJob();
        FilterProfile filterProfile = new FilterProfile();
        CleanTempFiles cleanTempFiles = new CleanTempFiles();

        Command emailCommand = new EmailCommand(emailJob);
        Command filterCommand = new FilterCommand(filterProfile);
        Command cleanTempCommand = new CleanTempCommand(cleanTempFiles);
        Scheduler jobScheduler = new Scheduler();
        jobScheduler.addJob(emailCommand);
        jobScheduler.addJob(cleanTempCommand);
        jobScheduler.addJob(filterCommand);
        jobScheduler.runAll();


    }
}
