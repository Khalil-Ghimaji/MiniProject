import java.util.ArrayList;

public class GradeLevel {
    private final String gradeLevelName;
    private final ArrayList<Student> students;
    private final Timetable timetable;

    public GradeLevel(String gradeLevelName, Timetable timetable) {
        this.gradeLevelName = gradeLevelName;
        this.timetable = timetable;
        for (Course course : timetable.getCourses()) {
            course.setGradeLevel(this);
        }
        this.students = new ArrayList<>();
    }

    public String getGradeLevelName() {
        return gradeLevelName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Timetable getTimetable() {
        return timetable;
    }
}
