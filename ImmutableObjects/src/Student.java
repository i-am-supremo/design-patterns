import java.util.ArrayList;
import java.util.List;

public final class Student {

    private final int id;
    private final String name;
    private final int marks;
    private final List<Integer> friends;

    public Student(int id, String name, int marks, List<Integer> friends) {

        this.id = id;
        this.name = name;
        this.marks = marks;
        List<Integer> friendsCopy = new ArrayList<>(friends);
        this.friends = friendsCopy;
    }

    public int getId() {
        return this.id;
    }

    public int getMarks() {
        return this.marks;
    }

    public List<Integer> getFriends() {
        return this.friends;
    }

    public String getName() {
        return this.name;
    }
}
