package company;

public class Test {
    public static void main(String[] args) {
         Participant[] participants = {new Robot(), new Cat(), new Person(), new Cat()};
         for (Participant p : participants) {
             Treadmill.passObstacle(p);
             Wall.passObstacle(p);
             System.out.println();
         }
    }
}