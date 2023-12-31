public class Subject {
    private final String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
