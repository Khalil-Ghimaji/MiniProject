import java.util.ArrayList;

public class Student extends Person {
    private static int identifier = 0;
    private final GradeLevel gradeLevel;
    private ArrayList<Exam> exams;

    public Student(String firstName, String lastName, GradeLevel gradeLevel) {
        super(firstName, lastName);
        this.gradeLevel = gradeLevel;
        gradeLevel.getStudents().add(this);
        identifier++;
        this.id = identifier;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void joinClubAsMemeber(Club club) {
        club.addMember(this);
    }

    public void joinClubStaff(Club club) {
        club.addStaffMember(this);
    }

    public void printTimetable() {
        gradeLevel.getTimetable().printTimetable();
    }

    public void sitForExam(Exam exam) {
        exams.add(exam);
    }
}