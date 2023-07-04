package seminars.seminar6.homework;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100, 7);
        Plate plate = new Plate(150);

        murzik.eat(plate);
        murzik.eat(plate);
    }
}
