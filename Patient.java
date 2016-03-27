

public class Patient {
	String name;
	int age;
	String email;
	String phone;
	
	
	public Patient(String name, int age, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
	}



	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	

}
