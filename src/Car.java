

public class Car extends ManyShapes{

  // Create a car object by assigning an origin point, clearance, x and y size (of the car body). 
  // wheel radius is set by clearance and wheels are inset 
  public Car(Point setOrigin, double clearance, double xSize, double ySize){
    Point origin =  setOrigin;
    double wheelInset = 0.03;
    // Create rectangle corner points. 
    Point rll = new Point (setOrigin.x,setOrigin.y + clearance);
    Point rtr = new Point (setOrigin.x + xSize, setOrigin.y + clearance + ySize);
    // create the origin points for the wheels
    Point leftaxis = new Point(setOrigin.x + wheelInset, setOrigin.y + clearance);
    Point rightaxis = new Point(setOrigin.x + xSize - wheelInset, setOrigin.y + clearance);

    // create the rectangle part of the car (the body)
    Rectangle rect = new Rectangle(rll, rtr);

    // Create the wheel circles. 
    Circle leftWheel = new Circle(leftaxis, clearance);
    Circle rightWheel = new Circle(rightaxis, clearance);

    addShape(rect);
    addShape(leftWheel);
    addShape(rightWheel);

  }

  // No longer needed methods because they are being implemented in the ManyShapes class now!
  // - increment origin
  // - set position
  // - set vel

}
