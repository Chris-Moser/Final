
public class Shape {

	
		String shapeID;

		int cordinatex;
		
		int cordinatey;
		
		int radius;



	public Shape(String ID, int r, int x, int y) {
		shapeID = ID;

		cordinatex = x;
		
		cordinatey = y;

		radius = r;
	}









	public int getCordinatex() {
		return cordinatex;
	}




	public void setCordinatex(int cordinatex) {
		this.cordinatex = cordinatex;
	}




	public int getCordinatey() {
		return cordinatey;
	}




	public void setCordinatey(int cordinatey) {
		this.cordinatey = cordinatey;
	}




	public String getShapeID() {
		return shapeID;
	}




	public void setShapeID(String shapeID) {
		this.shapeID = shapeID;
	}




	




	public int getRadius() {
		return radius;
	}




	public void setRadius(int radius) {
		this.radius = radius;
	}
	}


