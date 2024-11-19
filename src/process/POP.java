package process;

import java.util.ArrayList;

import data.Computer;
import data.Mail;
import data.MailServer;

public class POP implements Protocol{
	
	private Computer pc;
	private MailServer server;

	public POP(MailServer server, Computer pc) {
		this.server=server;
		this.pc=pc;
	
	}
	@Override
	public String request() {
		pc.setMail(server.getMail());	
		return "Mails are transfers to the Computer";
	}
}
