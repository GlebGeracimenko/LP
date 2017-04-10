/**
 * Created by gleb on 09.04.17.
 */
public class Student {

    private String name;

    private Float srBal;

    public Student(String name, Float srBal) {
        this.name = name;
        this.srBal = srBal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSrBal() {
        return srBal;
    }

    public void setSrBal(Float srBal) {
        this.srBal = srBal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", srBal=" + srBal +
                '}';
    }
}
