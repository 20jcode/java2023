package hw09;
import java.util.*;

public class Circle implements MyComparable{
	private final Point center;
	private final int radius;

	public Circle (final int x,final int y,final int radius) {
		center = new Point(x,y);
		this.radius = radius;
	}

	@Override
	public int compareTo (MyComparable other) {
		return Long.compare(getSize(), other.getSize());
	}

	@Override
	public long getSize () {
		return Math.round(Math.pow(radius,2)*3.14);
	}

	@Override
	public String toString () {
		return "[ "+center+" "+radius+" "+getSize()+" ]";
	}
}
