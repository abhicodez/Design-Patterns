package com.abhiwarez.designpattern.creational.builder;

public class Email {

	// required parameters
	private String to;
	private String from;
	private String subject;

	// optional parameters
	private boolean isHighPriority;
	private boolean isMeetingInvite;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private Email(EmailBuilder builder) {
		this.to = builder.to;
		this.from = builder.from;
		this.subject = builder.subject;
		this.isHighPriority = builder.isHighPriority;
		this.isMeetingInvite = builder.isMeetingInvite;
	}

	// Builder Class
	public static class EmailBuilder {

		// required parameters
		private String to;
		private String from;
		private String subject;

		// optional parameters
		private boolean isHighPriority;
		private boolean isMeetingInvite;

		public EmailBuilder(String to, String from, String subject) {
			this.to = to;
			this.from = from;
			this.subject = subject;
		}

		public EmailBuilder setHighPriority(boolean isHighPriority) {
			this.isHighPriority = isHighPriority;
			return this;
		}

		public EmailBuilder setMeetingInvite(boolean isMeetingInvite) {
			this.isMeetingInvite = isMeetingInvite;
			return this;
		}

		public Email build() {
			return new Email(this);
		}

	}

	@Override
	public String toString() {
		return "Email [to=" + to + ", from=" + from + ", subject=" + subject + ", isHighPriority=" + isHighPriority
				+ ", isMeetingInvite=" + isMeetingInvite + "]";
	}

	

}
