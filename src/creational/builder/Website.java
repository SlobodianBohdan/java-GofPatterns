package creational.builder;

import java.time.LocalDate;

public class Website {
    private String name;
    private BackendProgrammingLanguage backendProgrammingLanguage;
    private FrontendProgrammingLanguage frontendProgrammingLanguage;
    private DataBaseForWebsite dataBaseForWebsite;
    private LocalDate startedCreated;
    private int price;

    public static WebsiteBuilder builder() {
        return new WebsiteBuilder();
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' + "\n" +
                "   backendProgrammingLanguage=" + backendProgrammingLanguage + '\'' + "\n" +
                "   frontendProgrammingLanguage=" + frontendProgrammingLanguage + '\'' + "\n" +
                "   dataBaseForWebsite=" + dataBaseForWebsite + '\'' + "\n" +
                "   startedCreated=" + startedCreated + '\'' + "\n" +
                "   price=" + price + '\'' +
                '}';
    }

    public static class WebsiteBuilder{
        private final Website website;

        private WebsiteBuilder(){
            website = new Website();
        }

        public WebsiteBuilder addName(String name) {
            website.name = name;
            return this;
        }
        public WebsiteBuilder addBackendProgrammingLanguage(
                BackendProgrammingLanguage backendProgrammingLanguage){
            website.backendProgrammingLanguage = backendProgrammingLanguage;
            return this;
        }
        public WebsiteBuilder addFrontendProgrammingLanguage(
                FrontendProgrammingLanguage frontendProgrammingLanguage){
            website.frontendProgrammingLanguage = frontendProgrammingLanguage;
            return this;
        }
        public WebsiteBuilder addDataBaseForWebsite(DataBaseForWebsite dataBaseForWebsite){
            website.dataBaseForWebsite = dataBaseForWebsite;
            return this;
        }
        public WebsiteBuilder addStartedCreated(){
            website.startedCreated = LocalDate.now();
            return this;
        }
        public WebsiteBuilder addPrice(int price){
            website.price = price;
            return this;
        }

        Website build(){
            return website;        }
    }
}
