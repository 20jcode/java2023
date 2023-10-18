package hw07.edu.pnu.shape;

public class Point {
	private int x,y;

	public Point (final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString () {
		return "["+x+","+y+"]";
	}
}
