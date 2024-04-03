package design_patterns.creational.fluent_builder;

import design_patterns.creational.fluent_builder.Email.EmailBuilder;

public class Application {

	public static void main(String[] args) {
		Email email = EmailBuilder.getInstance()
				.to("Luis")
				.from("Oscar")
				.subject("subject")
				.content("Test email")
				.build();
		
		System.out.println(email);
	}
}
