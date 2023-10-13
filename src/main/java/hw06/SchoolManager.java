package hw06;

import java.util.*;

public class SchoolManager {
	private List<School> schools = new ArrayList<>();

	public void removeAllSchools(){
		schools.clear();
	}

	public School findSchool(final String schoolName){
		for(School s : schools){
			if(s.getName().equals(schoolName)){
				return s;
			}
		}
		return null;
	}

	public School createSchool(final String schoolName){
		schools.add(new School(schoolName));

		return findSchool(schoolName);
	}

	public List<Student> findStudent(final String studentName,final int schoolYear){

		List<Student> ans = new ArrayList<>();

		for(School s : schools){
			if(s.findStudentNameAndYear(studentName,schoolYear).isPresent()){
				ans.add(s.findStudentNameAndYear(studentName,schoolYear).get());
			}

		}
		return ans;
	}

	@Override
	public String toString () {
		return "Total School Count: "+schools.size();
	}
}
