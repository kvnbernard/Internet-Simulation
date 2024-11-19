package data;

import java.util.HashMap;

public class WebServer extends Server
{
	private IPAddress ip;
	private HashMap<IPAddress, String> html;
	private IPAddress ucp= new IPAddress("1.160. 10.567");
	private IPAddress betclic= new IPAddress("1.250. 10.243");
	private IPAddress google= new IPAddress("1.160. 10.240");
	private IPAddress ubereat= new IPAddress("1.120. 10.540");
	
	public WebServer(String address)
	{
		super(address);
		Mail mail1= new Mail("Aide Memoire");
		Mail mail2= new Mail("TP5");
		
	}
	
	public void setIp(IPAddress ip) {
		this.ip = ip;
	}
	
	public String getHtml() 
	{
		html = new HashMap<IPAddress, String>();
		html.put(ucp,"ucp.html");
		html.put(google,"google.html");
		html.put(betclic,"betclic.html");
		html.put(ubereat,"uberEat.html");
		
		return html.get(ip);
	} 
	
  public String toString()
  {
	return super.toString();
  }
}
