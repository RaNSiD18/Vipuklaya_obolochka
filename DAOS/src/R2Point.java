import java.util.Scanner;

public class R2Point {
    private double x, y;

    public R2Point(double x, double y) {
        this.x = x; this.y = y;
    }

    public R2Point() throws Exception {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public static double dist(R2Point a, R2Point b) {
        if (a.y<0 && b.y<0){
            return 0;
        }

        if (a.y<0 && b.y>0 || b.y<0 && a.y>0)
        {
            if(a.y<0)
                return Math.sqrt((a.x-(a.x-a.y*(a.x-b.x)/(a.y+b.y)))*(a.x-(a.x-a.y*(a.x-b.x)/(a.y+b.y)))+(a.y-0)*(a.y-0));
            if(b.y<0)
                return Math.sqrt((b.x-(b.x-b.y*(b.x-a.x)/(b.y+a.y)))*(b.x-(b.x-b.y*(b.x-a.x)/(b.y+a.y)))+(b.y-0)*(b.y-0));
        }
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }

    public static double area(R2Point a, R2Point b, R2Point c) {
        return 0.5*((a.x-c.x)*(b.y-c.y)-(a.y-c.y)*(b.x-c.x));
    }

    public static boolean equal(R2Point a, R2Point b) {
        return a.x==b.x && a.y==b.y;
    }

    public static boolean isTriangle(R2Point a, R2Point b, R2Point c) {
        return area(a, b, c) != 0.0;
    }

    public boolean inside(R2Point a, R2Point b) {
        return (a.x <= x && x <= b.x || a.x >= x && x >= b.x) &&
                (a.y <= y && y <= b.y || a.y >= y && y >= b.y);
    }

    public boolean light(R2Point a, R2Point b) {
        double s = area(a, b, this);
        return s < 0.0 || ( s == 0.0 && ! inside(a, b));
    }

    public int get_x(){
        return (int)this.x;
    }

    public int get_y(){
        return (int)this.y;
    }
}
