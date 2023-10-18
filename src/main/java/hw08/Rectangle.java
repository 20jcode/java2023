package hw08;

public class Rectangle extends Shape{

	private final int w;
	private final int h;

	Rectangle(final int w,final int h){
		this.w = w;
		this.h = h;
		setArea(w*h);
		setType("R");
	}

	@Override
	public String toString () {
		return "Rectangle " +
				w+" " +
				h+" " +
				getArea();
	}
}
