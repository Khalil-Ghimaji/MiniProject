public class Exam {
    private final Subject subject;
    private final Teacher teacher;
    private final Classroom classroom;
    private final GradeLevel gradeLevel;
    private final String dateAndTime;

    public Exam(Subject subject, Teacher teacher, Classroom classroom, GradeLevel gradeLevel, String dateAndTime) {
        this.subject = subject;
        this.teacher = teacher;
        this.classroom = classroom;
        this.gradeLevel = gradeLevel;
        this.dateAndTime = dateAndTime;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public String toString() {
        return "Exam{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", classroom=" + classroom +
                ", gradeLevel=" + gradeLevel +
                ", dateAndTime='" + dateAndTime + '\'' +
                '}';
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
