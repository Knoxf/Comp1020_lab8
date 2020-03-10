public class Point extends Shape{
    // Current position of the point
    public double x;
    public double y;
    
    // current velocity of the point
    public double xVel;
    public double yVel;
    
    // draw the point (for debugging)
    public void draw(){
        StdDraw.circle(x,y,.01);
    }
    
    // create a new point at the given coordinates
    public Point(double initX, double initY){
          x = initX; y=initY; 
    }
    
    // update the velocity of the point. 
    public void setVel(double newX, double newY){
        xVel = newX;
        yVel = newY;
    }
    
    // update the point to a new position. 
    public void update(){
        move(xVel, yVel);
    }
    
    public void move(double xOffset, double yOffset){
        x += xOffset;
        y += yOffset;
    }
}
