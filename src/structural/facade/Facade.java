package structural.facade;

public class Facade {
    Developer developer = new Developer();
    Task task = new Task();
    BugTracker bugTracker = new BugTracker();

    public void startSolveProblems(){
        task.doTask();
        bugTracker.startSprint();
        developer.doTaskBeforeDeadline(bugTracker);
    }

    public void stopSolveProblems(){
        task.doTask();
        bugTracker.finishSprint();
        developer.doTaskBeforeDeadline(bugTracker);
    }
}
