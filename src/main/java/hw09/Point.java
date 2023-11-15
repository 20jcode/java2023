package hw09;

public class Point {
	private final int x,y;

	public Point (final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public int getX () {
		return x;
	}

	public int getY () {
		return y;
	}

	@Override
	public String toString () {
		return "[ "+x+", "+y+" ]";
	}
}
