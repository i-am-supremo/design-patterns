import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        Student student = new Student(101, "Manish", 92, list);
        System.out.println(student);
    }
}