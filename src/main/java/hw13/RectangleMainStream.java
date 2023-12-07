package hw13;
import java.util.*;
import java.util.stream.Collectors;

public class RectangleMainStream {
	public static void main (String[] args) {
		List<Rectangle> list0 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Rectangle r = new Rectangle(i + 10, i + 10);
			list0.add(r);
		}
		/*
		list0.stream().filter(e -> e.getArea() >= 200).filter(e -> e.getWidth() % 2 == 0)
				.forEach(e -> System.out.println(e.getName().toUpperCase()));
		*/
		//ver2
		list0.stream().filter(e -> e.getArea() >= 200).filter(e -> e.getWidth() % 2 == 0).
				map(e->e.getName().toUpperCase()).forEach(System.out::println);

	}
}