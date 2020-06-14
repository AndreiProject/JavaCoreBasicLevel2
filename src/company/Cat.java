package company;

public class Cat implements Participant {

    @Override
    public void run() {
        System.out.println("пробежал");
    }

    @Override
    public void jump() {
        System.out.println("прыгнул");
    }
}
