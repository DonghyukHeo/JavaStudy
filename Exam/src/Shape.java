
public class Shape {
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getArea() {
		return this.width * this.height;
	}
	
	public int getArea(int x, int y) {
		//this.setWidth(x);
		//this.setHeight(y);
		
		this.width = x;
		this.height = y;
		
		//return this.getArea();
		return this.width * this.height;
	}	
	
	public int getRound() {
		return this.width * 2 + this.height * 2;
	}
	
	public int getRound(int x, int y) {
		//this.setWidth(x);
		//this.setHeight(y);
		
		this.width = x;
		this.height = y;
		
		return this.getRound();
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}	
	

}
