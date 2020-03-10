// Draws a Triangle using Points. 
public class Triangle extends Shape
{
    private Point a;
    private Point b;
    private Point c;
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void draw(){
        //  public static void line(double x0, double y0, double x1, double y1)
        StdDraw.line(a.x, a.y, b.x, b.y);
        StdDraw.line(b.x, b.y, c.x, c.y);
        StdDraw.line(c.x, c.y, a.x, a.y);
    }
}
