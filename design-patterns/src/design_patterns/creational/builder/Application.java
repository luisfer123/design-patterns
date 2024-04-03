package design_patterns.creational.builder;

import design_patterns.creational.builder.User.UserBuilder;

public class Application {
	
	public static void main(String[] args) {
		User user = new UserBuilder("username", "some@mail.com")
				.firstName("firstName")
				.lastName("lastName")
				.age(35)
				.build();
		
		System.out.println(user);
	}

}
