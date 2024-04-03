package design_patterns.creational.fluent_builder;

public class Email {
	
	private String to; // required
	private String from; // required
	private String subject; // required
	private String content; // required
	private String bcc; // optional
	private String cc; // optional
	
	private Email(EmailBuilder emailBuilder) {
		this.to = emailBuilder.to;
		this.from = emailBuilder.from;
		this.subject = emailBuilder.subject;
		this.content = emailBuilder.content;
		this.bcc = emailBuilder.bcc;
		this.cc = emailBuilder.cc;
	}
	
	public String getTo() {
		return to;
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getBcc() {
		return bcc;
	}

	public String getCc() {
		return cc;
	}

	@Override
	public String toString() {
		return "Email [to = " + to + ", from = " + from + ", subject = " + subject + "]";
	}
	
	// Interfaces to set fields
	
	interface EmailTo {
		EmailFrom to(String to);
	}
	
	interface EmailFrom {
		EmailSubject from(String from);
	}
	
	interface EmailSubject {
		EmailContent subject(String subject);
	}
	
	interface EmailContent {
		EmailCreator content(String subject);
	}
	
	interface EmailCreator {
		EmailCreator bcc(String bcc);
		EmailCreator cc(String cc);
		Email build();
	}

	public static class EmailBuilder implements EmailTo, EmailFrom, EmailSubject, EmailContent, EmailCreator {
		private String to;
		private String from;
		private String subject;
		private String content;
		private String bcc;
		private String cc;
		
		private EmailBuilder() { }
		
		public static EmailTo getInstance() {
			return new EmailBuilder();
		}

		@Override
		public EmailFrom to(String to) {
			this.to = to;
			return this;
		}
		
		@Override
		public EmailSubject from(String from) {
			this.from = from;
			return this;
		}
		
		@Override
		public EmailContent subject(String subject) {
			this.subject = subject;
			return this;
		}
		
		@Override 
		public EmailCreator content(String content) {
			this.content = content;
			return this;
		}
		
		@Override
		public EmailCreator bcc(String bcc) {
			this.bcc = bcc;
			return this;
		}
		
		@Override
		public EmailCreator cc(String cc) {
			this.cc = cc;
			return this;
		}
		
		@Override
		public Email build() {
			return new Email(this);
		}
		
	}

}
