import java.util.Scanner;
public class ConvexTest {
    public static void main(String[] args) throws Exception {
        Convex convex = new Convex();
        Drawing w1 = new Drawing(convex);
        while (true) {
            convex.add(new R2Point());
            System.out.println("S = " + convex.area() + " , P = " + convex.perimeter());
            w1.repaint();
        }

    }
}