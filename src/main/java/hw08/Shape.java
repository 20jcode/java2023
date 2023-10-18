package hw08;

public abstract class Shape {
	private float area;
	private String shapeType;

	public float getArea(){
		return area;
	};

	public void setArea(final float num){
		area = num;
	};

	public String getType(){
		return shapeType;
	}

	public void setType(final String c){
		shapeType = c;
	}
}
