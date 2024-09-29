package g2.practice5;

public class DogTest {
    public static void main(String[] args) {
        Dog nero = new Dog();
        nero.name = "Nero";

        nero.bark();
        nero.eat("lamb cookies");
        System.out.println(nero.name);
    }
}
