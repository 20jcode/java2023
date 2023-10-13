package hw5;

import java.util.Arrays;
import java.util.Objects;

public class School {
	private String name ;
	private int limit ;

	private Student[] students ;
	private int studentCount ;

	public String toString() {
		String msg = "School Name: " + name + " Student Count: "
			+ studentCount + "\n" ;

		for ( int i = 0 ; i < studentCount ; i ++ ) {
			msg += "\t" + students[i] + "\n" ;
		}
		return msg ;
	}

	// other methods including constructor, equals(), hashCode()

	School(final String name,final int limit){
		this.name = name;
		this.limit = limit;
		this.studentCount = 0;
		students = new Student[limit];
	}

	public void addStudent(final Student newStudent){
		if (studentCount < limit){
			students[studentCount] = newStudent;
			studentCount++;
		}
	}

	public void removeAllStudent(){
		while(studentCount >0){
			students[studentCount] = null;
			studentCount--;
		}
	}

	public Student findStudent(final String studentName,final int schoolYear){

		final Student isStudent = new Student(studentName,schoolYear);

		for(int i = 0; i<studentCount; i++){
			if(students[i].equals(isStudent)){
				return students[i];
			}
		}
		return null;
	}

	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		School school = (School) o;

		if (limit != school.limit) return false;
		if (studentCount != school.studentCount) return false;
		if (!Objects.equals(name, school.name)) return false;

		return Arrays.equals(students, school.students);
	}

	@Override
	public int hashCode () {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + limit;
		result = 31 * result + Arrays.hashCode(students);
		result = 31 * result + studentCount;
		return result;
	}


}

