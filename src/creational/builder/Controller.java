package creational.builder;

public class Controller {
    public static void main(String[] args) {
        Website website = Website.builder()
                .addName("My Company")
                .addBackendProgrammingLanguage(BackendProgrammingLanguage.JAVA)
                .addFrontendProgrammingLanguage(FrontendProgrammingLanguage.JAVASCRIPT)
                .addDataBaseForWebsite(DataBaseForWebsite.POSTGRESQL)
                .addPrice(1000)
                .addStartedCreated()
                .build();

        System.out.println(website.toString());

    }
}
