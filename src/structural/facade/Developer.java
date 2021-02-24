package structural.facade;

public class Developer {
    public void doTaskBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving the task.");
        }else {
            System.out.println("Developer in reserve.");
        }
    }
}
