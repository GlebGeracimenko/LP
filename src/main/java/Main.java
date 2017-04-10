import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gleb on 09.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student("Ivanov", 4.5f);
        Student pupkin = new Student("Pupkin", 3.0f);
        Student vetrov = new Student("Vetrov", 4.3f);
        Student petrov = new Student("Petrov", 3.2f);
        Student levchenko = new Student("Levchenko", 4.6f);
        Student sidorov = new Student("Sidorov", 5.0f);

        List<Student> studentList = Arrays.asList(ivanov, pupkin, vetrov, petrov, levchenko, sidorov);
        List<Student> validStudent = studentList.stream().filter(s -> s.getSrBal() >= 4.9f).collect(Collectors.toList());

        System.out.println(Arrays.toString(validStudent.toArray()));
    }
}
