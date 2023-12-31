import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject("POO");
        Teacher teacher = new Teacher("Issam", "ALLANI");
        Classroom classroom = new Classroom(212);
        Course course = new Course(1, "POO first chapter", subject, teacher, classroom);
        ArrayList<ArrayList<Course>> courses = new ArrayList<>();
        ArrayList<Course> todayCourses = new ArrayList<>();
        todayCourses.add(course);
        courses.add(todayCourses);
        Timetable timetable = new Timetable(courses);
        GradeLevel gl2 = new GradeLevel("gl2", timetable);
        Student S1 = new Student("khalil", "ghimaji", gl2);
        Club acm = new Club("ACM");
        S1.joinClubAsMemeber(acm);
        S1.printTimetable();
        Exam pooExam = new Exam(subject, teacher, classroom, gl2, "31/12/2023");
        S1.sitForExam(pooExam);
    }
}