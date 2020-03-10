public class House extends ManyShapes{
	
	public House(Point origin, double baseHeight, double baseWidth, double roofHeight, double roofWidth, double doorHeight, double doorWidth){
		
		super(); // just as a reminder
		Point setOrigin = origin;

		//Point originPoint = new Point(setOrigin.x, setOrigin.y);

		// set the house body rectangle point
		Point rll = new Point(setOrigin.x-(baseWidth/2),setOrigin.y);//the house leftDown point
		Point rtr = new Point(setOrigin.x+(baseWidth/2),setOrigin.y+baseWidth);  // the house right up point

		//the the proof of the house
		Point rlltl = new Point(setOrigin.x-baseWidth-((roofWidth-baseWidth)/2),setOrigin.y+baseHeight);//left
		Point rlltT = new Point(setOrigin.x,setOrigin.y+baseHeight+roofHeight);
		Point rllltr = new Point(setOrigin.x+(baseHeight/2)+((roofWidth-baseWidth)/2),setOrigin.y+baseHeight);


		Rectangle rect = new Rectangle(rll,rtr);
		Triangle tri = new Triangle(rllltr,rlltl,rlltT);
		addShape(tri);
		addShape(rect);

	} 
}