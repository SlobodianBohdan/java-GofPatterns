package creational.singleton;

public class Runner {
    public static void main(String[] args) {
        ProgramLogger.getInstance().addLogInfo("1 log");
        ProgramLogger.getInstance().addLogInfo("2 log");
        ProgramLogger.getInstance().addLogInfo("3 log");
        ProgramLogger.getInstance().addLogInfo("4 log");

        ProgramLogger.getInstance().showLogFile();

        System.out.println(ProgramLogger.getInstance().toString());
        System.out.println(ProgramLogger.getInstance().toString());


        ProgramLogger p1 = ProgramLogger.getInstance();
        ProgramLogger p2 = ProgramLogger.getInstance();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
