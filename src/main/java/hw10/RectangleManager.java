package hw10;
import java.util.*;
public class RectangleManager {
	private List<Rectangle> rectangles = new ArrayList<>() ;
	private Scanner scannerObject ;

	public RectangleManager (Scanner scannerObject) {
		this.scannerObject = scannerObject;
	}

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in) ;
		RectangleManager manager = new RectangleManager(scannerObject) ;
		while ( true ) {
			System.out.println("Enter a command: [create width height, zoom id ratio or quit]") ;
			final String command = scannerObject.next() ;
				if ( command.equalsIgnoreCase("create")) { manager.create() ; }
				else if ( command.equalsIgnoreCase("zoom")) { manager.zoom() ; }
				else if ( command.equalsIgnoreCase("showAll")) { manager.showAll() ; }
				else if ( command.equalsIgnoreCase("quit")) { System.out.println("Bye") ; break ; }
		}
		scannerObject.close();
	}

	private void showAll () {
		rectangles.forEach(System.out::println);
	}

	private void zoom () {
		final int rIndex = scannerObject.nextInt();
		final int zoomSize = scannerObject.nextInt();

		try{
			Rectangle r = rectangles.get(rIndex);
			System.out.println("Before: "+r);

			r.setWidth(r.getWidth()*zoomSize);
			r.setHeight(r.getHeight()*zoomSize);

			System.out.println("After: "+r);

		} catch (IndexOutOfBoundsException e){
			System.out.println("존재하지 않는 배열의 원소를 접근했습니다."+e);
		}


	}

	private void create () {
		try{
			int width = Integer.parseInt(scannerObject.next());
			int height = Integer.parseInt(scannerObject.next());
			Rectangle r = new Rectangle(width,height);
			rectangles.add(r);
			System.out.println(r+" is added at "+rectangles.indexOf(r));

		} catch (InvalidRectangleException e) {
			System.out.println("사각형의 넓이와 높이는 양수이어야 합니다."+e.getWidth()+" "+e.getHeight());
		} catch (Exception e){
			System.out.println("입력된 인자의 형식이 맞지 않습니다.");
		}
	}

}
