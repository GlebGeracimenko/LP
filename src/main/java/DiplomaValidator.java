/**
 * Created by gleb on 09.04.17.
 */
public class DiplomaValidator {
    public static boolean valid(Student student) {
        return student.getSrBal() >= 4.9 ? true : false;
    }
}
