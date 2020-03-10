// Rectangle draws a rectangular shape to the GUI
// It is defined by its lower left and upper right points
public class Rectangle extends Shape {
    private Point lowerLeft;
    private Point upperRight;
    
    // Initialize the Rectangle with lower left and upper right points
    public Rectangle(Point ll, Point ur) {
        lowerLeft= ll; 
        upperRight= ur; 
    }
    
    // Move the Rectangle by the given offset
    public void move(double xOffset, double yOffset){
       lowerLeft.move(xOffset, yOffset);
       upperRight.move(xOffset, yOffset);
    }
    
    // Set the velocity of this Shape
    public void setVel(double newX, double newY){
        lowerLeft.setVel(newX,newY);
        upperRight.setVel(newX,newY);
    }
    
    // update the Rectangle position by updating the position by
    // the velocity.
    public void update(){
        lowerLeft.update();
        upperRight.update();
    }
    
    // Draw the rectangle with current settings. 
    public void draw( ) {
         StdDraw.rectangle((lowerLeft.x+upperRight.x)/2,
               (lowerLeft.y+upperRight.y)/2,
                    (upperRight.x-lowerLeft.x)/2,
                    (upperRight.y-lowerLeft.y)/2);
      }//draw method
    }//Rectangle class