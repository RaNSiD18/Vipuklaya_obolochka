import java.awt.*;
public class Void implements Figure {
    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    public Figure add(R2Point p) {
        return new Point(p);
    }
    public void draw(Graphics g){
        g.drawLine(-10000, 0, 10000, 0);
        g.drawLine(0, -10000, 0, 10000);
    }


}
