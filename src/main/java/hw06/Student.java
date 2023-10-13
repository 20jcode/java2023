package hw06;

public class Student {
	private final String name ;
	private int year ;
	private final School theSchool ;

	public Student (School theSchool,String name, int year) {
		this.name = name;
		this.year = year;
		this.theSchool = theSchool;
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}

	@Override
	public String toString () {
		return "[Name: "+name+", School:"+theSchool+
				", "+year+"학년]";
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
