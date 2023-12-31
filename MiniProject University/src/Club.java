import java.util.ArrayList;

public class Club {
    private final String clubName;
    private final ArrayList<Student> members;
    private final ArrayList<Student> staff;

    public Club(String clubName) {
        this.clubName = clubName;
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public void addMember(Student student) {
        members.add(student);
    }

    public void addStaffMember(Student student) {
        staff.add(student);
    }

    public String getClubName() {
        return clubName;
    }
}
