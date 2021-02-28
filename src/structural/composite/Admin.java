package structural.composite;

public class Admin implements Object {
    private String firstName;
    private String role;
    private int age;

    public Admin(String firstName, String role, int age) {
        this.firstName = firstName;
        this.role = role;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Admin{" +
                "firstName='" + firstName + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}');
    }

}
