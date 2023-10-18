package hw07.edu.pnu.edit;

import hw07.edu.pnu.shape.Circle;
import hw07.edu.pnu.shape.Rectangle;

import java.util.ArrayList;
import java.util.*;

public class Editor {
	private List<Object> shapes = new ArrayList<>();

	public void add (Rectangle newRectangle) {

		shapes.add(newRectangle);
	}

	public void add (Circle newCircle){

		shapes.add(newCircle);
	}

	public void clear () {
		shapes.clear();
	}

	public void list () {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (Object e:shapes) {
			s.append(e).append(", ");
		}

		s.delete(s.length()-2,s.length());
		s.append("]");

		System.out.println(s.toString());
	}
}
