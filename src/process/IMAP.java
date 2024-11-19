package process;

import java.util.ArrayList;
import java.util.Iterator;

import data.Computer;
import data.Mail;
import data.MailServer;

public class IMAP implements Protocol{
	private Computer pc;
	private MailServer server;


	public IMAP(MailServer server, Computer pc) {
		this.server=server;
		this.pc=pc;
	}
	
	@Override
	public String request() {
		String contenu = null;
		Iterator<Mail> iter = server.getMail().iterator();
		while(iter.hasNext()){
			Mail mail=iter.next();
	
			 contenu += mail.getAddress()+"\n";
		}	
		return contenu;
	}
}