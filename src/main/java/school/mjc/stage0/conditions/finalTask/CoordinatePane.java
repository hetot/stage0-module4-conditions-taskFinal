package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x * y == 0) {
            System.out.println("zero");
        } else if (x * y < 0) {
            System.out.println(y > 0 ? "second" : "fourth");
        } else {
            System.out.println(y > 0 ? "first" : "third");
        }
    }
}
