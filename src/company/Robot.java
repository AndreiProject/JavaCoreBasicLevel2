package company;

public class Robot implements Participant {

    @Override
    public void run() {
        System.out.println("не умею бегать");
    }

    @Override
    public void jump() {
        System.out.println("не умею прыгать");
    }
}
