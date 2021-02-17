package behavioural.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"Java SE", "Spring Boot", "Maven and Gradle", "Stream API", "PostgreSQL"};

        JavaDeveloper javaDeveloper =new JavaDeveloper("Bohdan Slobodian", 23, skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Developer Age: " + javaDeveloper.getAge());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print("   " + iterator.next().toString() + "\n");
        }
    }
}
