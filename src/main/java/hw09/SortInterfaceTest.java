package hw09;

import java.util.*;

enum OperationKind{
	QUIT,INVALID,ADDL,ADDC,SORTA,SORTD,CLEAR,LIST
}

enum SortKind{
	ASCENDING,DESCENDING
}

public class SortInterfaceTest {

	private static Scanner scanner = new Scanner(System.in);
	private static List<MyComparable> comparableList = new ArrayList<>() ;

	public static void main(String[] args) {
		while ( true ) {
			final OperationKind op = getOperation(scanner) ;
			if ( op == OperationKind.QUIT ) {
				System.out.println("Bye") ;
				break;
			}
			if ( op == OperationKind.INVALID ) {
				System.out.println("Invalid Operation!");
				continue;
			}
				switch ( op ) {
			case ADDL : {
				final Line newLine = createLine(scanner) ;
				comparableList.add(newLine);
				System.out.println(newLine) ;
				break ;
			}
			case ADDC : {
				final Circle newCircle = createCircle(scanner) ;
				comparableList.add(newCircle);
				System.out.println(newCircle) ;
				break ;
			}
			case SORTA:
				sortList(comparableList, SortKind.ASCENDING) ;
				break ;
			case SORTD:
				sortList(comparableList, SortKind.DESCENDING) ;
				break ;
			case CLEAR:
				comparableList.clear() ;
				break ;
			case LIST:
				System.out.println(comparableList) ;
				break ;
			default: break;
			}
		}
	}

	private static Line createLine (final Scanner scanner) {
		final int x1 = scanner.nextInt();
		final int y1 = scanner.nextInt();
		final int x2 = scanner.nextInt();
		final int y2 = scanner.nextInt();


		return new Line(x1,y1,x2,y2);
	}

	private static Circle createCircle (final Scanner scanner){
		final int x = scanner.nextInt();
		final int y = scanner.nextInt();
		final int r = scanner.nextInt();

		return new Circle(x,y,r);
	}

	private static void sortList(final List<MyComparable> list,SortKind kind){
		if(kind == SortKind.ASCENDING){ //오름차순, 기본으로 오름차순정렬로 구현
			list.sort(MyComparable::compareTo);
		} else {
			list.sort(MyComparable::compareTo); //정렬하고 뒤집기
			Collections.reverse(list);
		}
	}

	private static OperationKind getOperation(final Scanner scanner){
		System.out.print("Enter Command String!  ");

		try{
			return OperationKind.valueOf(scanner.next().toUpperCase());
		} catch (IllegalArgumentException e){
			return OperationKind.INVALID;
		}
	}
}

