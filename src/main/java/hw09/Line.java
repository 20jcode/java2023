package hw09;

public class Line implements MyComparable {
	private final Point point1,point2;

	public Line (final int x1, final int y1, final int x2, final int y2) {
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
	}

	@Override
	public int compareTo (MyComparable other) {
		return Long.compare(this.getSize(), other.getSize());
	}

	@Override
	public long getSize () {
		final double xscope = Math.pow(point2.getX()- point1.getX(),2); // (x2-x1)^2
		final double yscope = Math.pow(point2.getY()- point1.getY(),2); // (y2-y1)^2

		return Math.round(Math.sqrt(xscope+yscope)); // 제곱의 합에 루트
	}

	@Override
	public String toString () {
		return "[ "+point1+" "+point2+" "+getSize()+" ]";
	}
}
