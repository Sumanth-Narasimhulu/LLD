package BehaviouralDesginPatterns.CommandDesignPattern.PracticeProblems.JobScheduler;

public class FilterCommand implements Command{
    private FilterProfile filterProfile;
    public FilterCommand(FilterProfile filterProfile){
        this.filterProfile = filterProfile;
    }

    public void execute(){
        filterProfile.profiles();
    }

}
