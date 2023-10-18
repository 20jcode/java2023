package hw08;

import java.util.*;

public class ShapeManager {

	private List<Shape> shapeList = new LinkedList<>();

	private void getLast(){//리스트의 마지막 요소 출력
		if(!shapeList.isEmpty()){
			System.out.println(shapeList.get(shapeList.size()-1));
		}

	}
	public void AddT(final int w,final int h){
		shapeList.add(new Triangle(w,h));
		getLast();
	}

	public void AddR(final int w,final int h){
		shapeList.add(new Rectangle(w,h));
		getLast();
	}

	public void AddC(final int x, final int y, final int r){
		shapeList.add(new Circle(x,y,r));
		getLast();
	}

	public void printAll(){//전부출력
		for(Shape e : shapeList){
			System.out.println(e);
		}
	}
	public void printType(final String c){
		boolean isCall = false;
		for(Shape e: shapeList){
			if(e.getType().toUpperCase().equals(c)){
				System.out.println(e);
				isCall = true;
			}
		}

		if(!isCall){ //일치하는 타입이 없을 시
			System.out.println("NONE");
		}
	}

	public void totalArea(){//전체합 출력
		float ans = 0;
		for(Shape e: shapeList){
			ans += e.getArea();
		}
		if(ans == 0){
			System.out.println("NONE");
		} else {
			System.out.println(ans);
		}

	}

	public void removeAll(){//모두 제거한다
		int ans = shapeList.size();
		shapeList = new ArrayList<>();
		System.out.println(ans);

	}
}
