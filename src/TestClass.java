
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
  public static void main(String[] args){
    testBasicShapes();
    testMultiShapes();
    testCar();
    testCarAsShape();
    testHouse();
    testHouse2();
  }

  private static void testBasicShapes(){
    // Basic Shapes demo
    Circle c = new Circle(new Point(0.5,0.5),0.1);
    Rectangle r = new Rectangle(new Point(0.6,.6), new Point(.8,.8));
    Triangle t = new Triangle(new Point(0.5,0.5), new Point(0.6,0.7), new Point(0.3,0.2));

    c.draw();
    r.draw();
    t.draw();
  }
    
  private static void testMultiShapes(){
    ManyShapes shapes = new ManyShapes();
    // Shapes to add
    Circle c = new Circle(new Point(0.5,0.5),0.1);
    Rectangle r = new Rectangle(new Point(0.6,.6), new Point(.8,.8));
    Triangle t = new Triangle(new Point(0.5,0.5), new Point(0.6,0.7), new Point(0.3,0.2));
  
    // Add shapes to ManyShapes object
    shapes.addShape(c);
    shapes.addShape(r);
    shapes.addShape(t);

    shapes.draw(); // should look the same as the basic ones. 
  }

  private static void testCar(){
    // public Car(Point setOrigin, double clearance, double xSize, double ySize)
    Car c1 = new Car( new Point(0.1,0.1), .1, .3, .2);
    Car c2 = new Car( new Point(0.5,0.5), .2, .4, .3);
    
    // For animation
    c1.setVel(0.03, 0);
    c2.setVel(-0.01, 0);

    int frameCount = 0;
    // Loop for 100 frames then exit
    while(frameCount < 100){
      c1.update();
      c2.update();

      c1.draw(); // draw the cars
      c2.draw();

      StdDraw.show(20);// ms
      StdDraw.clear();

      frameCount ++;
    }
  }

  // same as above but adding the cars to the ManyShapes for animation
   private static void testCarAsShape(){
    // public Car(Point setOrigin, double clearance, double xSize, double ySize)
    Car c1 = new Car( new Point(0.1,0.1), .1, .3, .2);
    Car c2 = new Car( new Point(0.5,0.5), .2, .4, .3);
    
    // For animation
    c1.setVel(0.01, 0);
    c2.setVel(0.02, 0);

    // Add the cars to the MultiShape for rendering. 
    ManyShapes allShapes = new ManyShapes();
    allShapes.addShape(c1);
    allShapes.addShape(c2);

    int frameCount = 0;
    // Loop for 100 frames then exit
    while(frameCount < 100){
      // seems like a small savings but with many Shapes it simplifies things a lot
      allShapes.update();
      allShapes.draw(); // draw the cars

      StdDraw.show(20);// ms
      StdDraw.clear();
      frameCount++;
    }
  }

  // Lab 8 Bronze
  private static void testHouse(){
    Point origin = new Point(.3, .2);
    double baseHeight = .4;
    double baseWidth = .5;
    double roofHeight = .2; // height added to baseHeight 
    double roofWidth = .6; // width total
    double doorHeight = .2; 
    double doorWidth = .1;
    //  public House(Point origin, double baseHeight, double baseWidth, 
    //    double roofHeight, double roofWidth,  
    //   double doorHeight, double doorWidth){
    House newHouse = new House(origin,baseHeight,baseWidth,roofHeight, roofWidth,doorHeight,doorWidth);
    StdDraw.clear();
    newHouse.draw();
    StdDraw.show(20);// ms
  } 

  // Lab 8 Bronze
  private static void testHouse2(){
    Point origin = new Point(.7, .3);
    double baseHeight = .5;
    double baseWidth = .2;
    double roofHeight = .1; // height added to baseHeight 
    double roofWidth = .4; // width total
    double doorHeight = .3; 
    double doorWidth = 0.05;
    //  public House(Point origin, double baseHeight, double baseWidth, 
    //    double roofHeight, double roofWidth,  
    //   double doorHeight, double doorWidth){
    House newHouse = new House(origin,baseHeight,baseWidth,roofHeight, roofWidth,doorHeight,doorWidth);
  //  StdDraw.clear();
    newHouse.draw();
    StdDraw.show(20);// ms
  } 
}
