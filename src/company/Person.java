package company;

public class Person implements Participant {
    @Override
    public void run() {
        System.out.println("пробежал");
    }

    @Override
    public void jump() {
        System.out.println("рыгнул");
    }
}