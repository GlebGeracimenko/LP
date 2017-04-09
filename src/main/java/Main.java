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

        System.out.println("Perfect mark in student " + ivanov.getName() + "? " + DiplomaValidator.valid(ivanov));
        System.out.println("Perfect mark in student " + pupkin.getName() + "? " + DiplomaValidator.valid(pupkin));
        System.out.println("Perfect mark in student " + vetrov.getName() + "? " + DiplomaValidator.valid(vetrov));
        System.out.println("Perfect mark in student " + petrov.getName() + "? " + DiplomaValidator.valid(petrov));
        System.out.println("Perfect mark in student " + levchenko.getName() + "? " + DiplomaValidator.valid(levchenko));
        System.out.println("Perfect mark in student " + sidorov.getName() + "? " + DiplomaValidator.valid(sidorov));

    }
}
