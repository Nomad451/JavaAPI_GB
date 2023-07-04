package seminars.seminar6;

import seminars.seminar6.homework.Cat;
import seminars.seminar6.homework.Plate;

import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 150, 5);
        Plate plate = new Plate(150);

        murzik.eat(plate);
        murzik.eat(plate);

        System.out.println(murzik);
        System.out.println(plate);


        Cat first = new Cat("Name", 150, 6);
        Cat second = new Cat("Name", 100, 8);

        System.out.println(first == second); // false
        System.out.println(first.equals(second));

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        HashSet<Cat> cats = new HashSet<>();
        cats.add(first);
        cats.add(second);
        System.out.println(cats);

    }

}
