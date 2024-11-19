package data;

import java.util.ArrayList;

public class MailServer extends Server
{
  private String type;
  private ArrayList<Mail> listmail = new ArrayList<Mail>();
  
  public MailServer(String address, String type)
  {
	super(address);
	this.type = type;
	Mail mail1= new Mail("AideMemoire");
	Mail mail2= new Mail("TP5");
	listmail.add(mail1);
	listmail.add(mail2);
  }

public String getType() {
	return type;
}

public ArrayList<Mail> getMail() {
	return listmail;
}

public void addMail(Mail mail) {
	listmail.add(mail);
}

public void setType(String type) {
	this.type = type;
}



@Override
public String toString() {
	return "MailServer [type=" + type + "]";
}
  
}
