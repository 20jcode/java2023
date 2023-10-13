package hw06;

import java.util.*;

public class School {
	private final String name ;
	private List<Student> students = new ArrayList<>() ;

	public School(final String name) { this.name = name ; }

	public void addStudent(final Student student){

		students.add(student);
	}

	public String getName(){
		return name;
	}

	public Optional<Student> findStudentNameAndYear(final String name, final int year){
		for(Student s : students){
			if((s.getName().equals(name))&&(s.getYear()==year)){
				return Optional.of(s);
			}
		}

		return Optional.empty();
	}

	@Override
	public String toString () {
		return name;
	}
}
