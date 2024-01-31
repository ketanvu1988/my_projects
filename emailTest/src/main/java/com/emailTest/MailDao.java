package com.emailTest;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailDao
{
	MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendEmail(MailModel mailmodel) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("ketanurkude@jivithealthcare.com");
		message.setTo(mailmodel.getTo());
		message.setSubject(mailmodel.getMessage());
		message.setText(mailmodel.getMessage());
		mailSender.send(message);
		
	}	
}
