package az.senan.ProtectedRestApi.model;

public class Student {

	private String name;
	
	private String surname;
	
	private String number;
	
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name, String surname, String number, String email) {
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", number=" + number + ", email=" + email + "]";
	}
	
}
