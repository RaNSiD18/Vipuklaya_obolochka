import java.awt.*;

public class Segment implements Figure {
    private R2Point p, q;
    public static  int x1, y1, x2, y2;

    public Segment(R2Point p, R2Point q) {
        this.p = p;
        this.q = q;
    }

    public double perimeter() {
        return 2.0 * R2Point.dist(p, q);
    }

    public double area() {
        return 0.0;
    }

    public Figure add(R2Point r) {
        if (R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);
        if (q.inside(p, r)) q = r;
        if (p.inside(r, q)) p = r;
        return this;
    }
    public void draw(Graphics g){
        g.clearRect(-Drawing.width/2, -Drawing.height/2, Drawing.width, Drawing.height);
        g.drawLine(p.get_x(), p.get_y(), q.get_x(), q.get_y());
        g.drawLine(-10000, 0, 10000, 0);
        g.drawLine(0, -10000, 0, 10000);
    }
}
