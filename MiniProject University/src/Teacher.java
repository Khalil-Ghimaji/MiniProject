public class Teacher extends Person {
    private static int identifier = 0;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        identifier++;
        this.id = identifier;
    }
}