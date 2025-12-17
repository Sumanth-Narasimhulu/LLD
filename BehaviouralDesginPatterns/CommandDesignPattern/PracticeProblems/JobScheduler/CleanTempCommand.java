package BehaviouralDesginPatterns.CommandDesignPattern.PracticeProblems.JobScheduler;

public class CleanTempCommand implements Command{
    private CleanTempFiles cleanTempFiles;
    public CleanTempCommand(CleanTempFiles cleanTempFiles){
        this.cleanTempFiles = cleanTempFiles;
    }
    public void execute(){
        cleanTempFiles.clean();
    }
}
