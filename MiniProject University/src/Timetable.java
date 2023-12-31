import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Timetable {
    private final Map<String, ArrayList<Course>> timetable = new HashMap<>();

    public Timetable(ArrayList<ArrayList<Course>> courses) {//matrix of courses a list of courses for each day
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int i = 0;
        for (ArrayList<Course> dayCourses : courses) {
            timetable.put(daysOfWeek[i], dayCourses);
        }
    }

    public void printTimetable() {
        for (Map.Entry<String, ArrayList<Course>> dayCourses : timetable.entrySet()) {
            String day = dayCourses.getKey();
            ArrayList<Course> courses = dayCourses.getValue();
            System.out.println("Day: " + day);
            for (Course course : courses) {
                System.out.println("  " + course);
            }
            System.out.println();
        }
    }

    public ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        for (ArrayList<Course> dayCourses : timetable.values()) {
            courses.addAll(dayCourses);
        }
        return courses;
    }
}
