import java.awt.Color;

// Cant create a Shape Directly
public abstract class Shape {
    	
	// Color of the shape
    protected Color colour;
    
    // Draws the Shape, overridden by subclasses
    public void draw(){ };

    // set the velocity of this Shape. 
    public void setVel(double newX, double newY){}
    
    // update the position of the Shape byt the velocity
    public void update(){}
    
    // update the current position of the Shape by the given offset
    public void move(double xOffset, double yOffset){}

}

