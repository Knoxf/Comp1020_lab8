public class ManyShapes extends Shape {
  
  // --- Basic variables ---
  // Max components
  private static final int MAX_PARTS = 25;
  // array of Shapes
  private Shape[] parts;
  // current number of Shapes
  private int numParts;
  
  // Constructor to create the empty shape. 
  public ManyShapes() {
    parts = new Shape[MAX_PARTS];
    numParts = 0; 
  }
  
  // Add a given shape to the array  
  public void addShape(Shape newShape){
    parts[numParts++] = newShape; 
  }
  
  // Draw All the shapes stored in this array. 
  public void draw( ){
    for(int i = 0 ; i < numParts; i++)
      parts[i].draw(); // draw each Shape
  }
  
  // Set the velocity of all shapes contained. 
  public void setVel(double newX, double newY){
      for(int i = 0 ; i < numParts; i++)
        parts[i].setVel(newX, newY);
  }

  // Update the position of the shape.
  public void update(){
    for(int i = 0 ; i < numParts; i++)
      parts[i].update();
  }
    
  // Move all the Shapes held by this object. 
  public void move(double xOffset, double yOffset){
    for(int i = 0 ; i < numParts; i++)
      parts[i].move(xOffset, yOffset);  
  }
}//class Thing