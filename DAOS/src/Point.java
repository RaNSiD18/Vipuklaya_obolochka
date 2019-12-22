import java.awt.*;
public class Point implements Figure {
    private R2Point p;
    public static int x1, y1;

    public Point(R2Point p) {
        this.p = p;
    }

    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    public Figure add(R2Point q) {
        if (!R2Point.equal(p,q)) return new Segment(p, q);
        else return this;
    }
    public void draw(Graphics g){
        g.fillOval(p.get_x(), p.get_y(), 3,3);
        g.drawLine(-10000, 0, 10000, 0);
        g.drawLine(0, -10000, 0, 10000);
    }


}
