public class Course {
    private final int courseId;
    private final String courseName;
    private final Subject subject;
    private final Teacher teacher;
    private final Classroom classroom;
    private GradeLevel gradeLevel;

    public Course(int courseId, String courseName, Subject subject, Teacher teacher, Classroom classroom) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.subject = subject;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getInstructor() {
        return teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", classroom=" + classroom +
                ", grade level=" + gradeLevel.getGradeLevelName() +
                '}';
    }
}
