package structural.facade;

public class Runner {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.startSolveProblems();
        System.out.println();
        facade.stopSolveProblems();
        System.out.println();
        facade.startSolveProblems();
    }
}
