package hw08;

public class Circle extends Shape{

	private final int x;
	private final int y;
	private final int r;

	Circle(int x,int y,int r){
		this.x = x;
		this.y = y;
		this.r = r;
		setArea((float)(Math.PI*r*r));
		setType("C");
	}

	@Override
	public String toString () {
		return "Circle " +
				x +" "+
				y +" "+
				getArea();
	}
}
