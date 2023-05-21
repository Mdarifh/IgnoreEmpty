package IignoreEmpty;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EmployeePOJOClass {
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private double salary;
	private boolean isMarried;
	private String[] hobbies;
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getDegree() {
		return degree;
	}
	public void setDegree(List<String> degree) {
		this.degree = degree;
	}
	public Map<String, String> getFamilymember() {
		return familymember;
	}
	public void setFamilymember(Map<String, String> familymember) {
		this.familymember = familymember;
	}
	private List<String> degree;
	private Map<String, String> familymember;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
