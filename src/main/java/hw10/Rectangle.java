package hw10;

public class Rectangle {

	private int width;
	private int height;
	public Rectangle (final int width, final int height) throws InvalidRectangleException {
		if(width <0 || height <0){
			throw new InvalidRectangleException(width, height);
		} else {
			this.width = width;
			this.height = height;
		}
	}

	@Override
	public String toString () {
		return "Rectangle: width "+width+", height "+height;
	}

	public int getWidth () {
		return width;
	}

	public int getHeight () {
		return height;
	}

	public void setWidth (final int width) {
		this.width = width;
	}

	public void setHeight (final int height) {
		this.height = height;
	}

	//zoom을 전부 RectangleManager에서 관리할 수 있도록.
	//Rectangle은 데이터만 담은 객체가 될 수 있도록.

}
