package hw07.edu.pnu.shape;

public class Rectangle {
	private int width, height;

	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString () {
		return "[ Rectangle "+width+" "+height+" "+ String.format("%.6f",(float)width*height )+"]"; // int 형식 곱이...?
	}
}
