package process;

import java.util.ArrayList;

import data.Mail;
import data.MailServer;

public class SMTP implements Protocol{
private MailServer servmail;
private Mail mail;
	
public SMTP(MailServer serv, Mail mail) {
	this.mail=mail;
	this.servmail=serv;
}

	@Override
	public String request() {
		servmail.addMail(mail);
		return "the Mail with the subject " + mail.getAddress() +" is transfer to the Server";
	}


}
