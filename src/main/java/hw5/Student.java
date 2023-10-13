package hw5;

public class Student {
	private String name ;
	private int year ;

	// other methods including constructor,
	// toString(), equals(), hashcode()

	public Student (final String name,final int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString () {
		return "["+name+","+year+"학년"+"]";
	}

	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (year != student.year) return false;
		return name.equals(student.name);
	}

	@Override
	public int hashCode () {
		int result = name.hashCode();
		result = 31 * result + year;
		return result;
	}
}
