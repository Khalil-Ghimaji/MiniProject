public class Classroom {
    int classRoomNumber;

    public Classroom(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    @Override
    public String toString() {
        return "classroom " + classRoomNumber;
    }
}
