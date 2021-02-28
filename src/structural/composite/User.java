package structural.composite;

public class User implements Object {
    private String firstName;
    private String role;
    private int age;

    public User(String firstName, String role, int age) {
        this.firstName = firstName;
        this.role = role;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("User{" +
                "firstName='" + firstName + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}');
    }
}
