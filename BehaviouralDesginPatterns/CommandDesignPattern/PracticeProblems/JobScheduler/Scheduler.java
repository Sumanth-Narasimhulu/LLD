package BehaviouralDesginPatterns.CommandDesignPattern.PracticeProblems.JobScheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
    private Queue<Command>q = new LinkedList<>();
    public void addJob(Command command){
        q.add(command);
    }
    public void runAll(){
        while(!q.isEmpty()){
            q.peek().execute();
            q.poll();
        }
    }
}
