package hw07.edu.pnu.shape;

public class Circle {
	private Point center;
	private int radius;

	public Circle (final Point point, final int radius) {

		center = point;
		this.radius = radius;
	}

	@Override
	public String toString () {
		return "[ Circle "+center+" "+radius+" "+String.format("%.6f",3.14*Math.pow((float)radius,2))+"]";
	} //Math.PI 대신 3.14 사용
}
