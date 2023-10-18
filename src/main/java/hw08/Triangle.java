package hw08;

public class Triangle extends Shape{

	private final int w;
	private final int h;

	Triangle(final int w,final int h){
		this.w = w;
		this.h = h;
		setArea(w*h*0.5f);
		setType("T");
	}

	@Override
	public String toString () {
		return "Triangle " +
				w + " " +
				h + " " +
				super.getArea();
	}
}
