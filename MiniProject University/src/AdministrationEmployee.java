public class AdministrationEmployee extends Person {
    private static int identifier = 0;

    public AdministrationEmployee(String firstName, String lastName) {
        super(firstName, lastName);
        identifier++;
        this.id = identifier;
    }

}
