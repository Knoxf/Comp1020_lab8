public class Circle extends Shape {
  // Center point
  private Point centre;
  // the radius
  private double radius;

  // Constructor accepts center point and radius
  public Circle(Point centerPoint, double radius) {
    // For demonstration purposes, you should try to keep a consistent style if possible
    centre = centerPoint; // not using this because the param is different
    this.radius = radius; // using this because the name is the same as param
  }

  // move the Circle by a given amount. 
  public void move(double xOffset, double yOffset){
    centre.move(xOffset, yOffset);
  }

  // Assign the velocity of this Shape
  public void setVel(double newX, double newY){
    centre.setVel(newX,newY);
  }

  // update this Circles position
  public void update(){
    centre.update();
  }

  // draw the circle
  public void draw( ) {
    StdDraw.circle(centre.x, centre.y, radius);
  }//draw method
}//Circle
