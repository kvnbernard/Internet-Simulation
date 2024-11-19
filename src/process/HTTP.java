package process;

import data.Computer;
import data.IPAddress;
import data.WebServer;

public class HTTP implements Protocol {
	
	private Computer pc;
	private WebServer server;
	private IPAddress ip;

	public HTTP(Computer pc,WebServer web, IPAddress ip) {
		this.server=web;
		this.pc=pc;
		this.ip=ip;
	}
	
	@Override
	public IPAddress request() {
		server.setIp(ip);
		System.out.println("Transfer IP adress to server : ");
		return pc.getIpAddress();
	}
	
	public String response() {
		return server.getHtml();
	}
	
	
	}