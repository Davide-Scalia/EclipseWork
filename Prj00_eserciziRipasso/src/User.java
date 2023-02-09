
public class User {
	String firstname;
	String lastname;
	int age;
	
	User(){
		this("","", 0);
	}
	
	User(String newFirstName, String newLastName, int newAge){
		this.setAge(newAge);
		this.setFirstname(newFirstName);
		this.setLastname(newLastName);
	}

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

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age<0) {
			throw new RuntimeException ("che stai facendo??");
			
		}
		
		this.age = age;
	}
	
	String getFullName () {
		return getFirstname()	+ " " + getLastname();
	}
	
	
}
