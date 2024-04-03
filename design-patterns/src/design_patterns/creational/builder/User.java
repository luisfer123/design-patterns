package design_patterns.creational.builder;

public class User {
	
	private String username;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private User(UserBuilder user) {
		this.username = user.username;
		this.email = user.email;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.age = user.age;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [username = " + username 
				+ ", email = " + email 
				+ ", firstName = " + firstName 
				+ ", lastName = " + lastName
				+ ", age = " + age + "]";
	}
	
	public static class UserBuilder {
		private String username; // required
		private String email; // required
		private String firstName; // optional
		private String lastName; // optional
		private int age; // optional
		
		// Fields initialized in constructor are mandatory (required) since there is only one
		// constructor.  If all fields are optional, a no arguments constructor is used instead.
		public UserBuilder(String username, String email) {
			this.username = username;
			this.email = email;
		}
		
		// Initialize optional fields using one method per field.
		
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}
		
		private void validateUserObject(User user) {
			// Do some validation here.
		}
	}

}
