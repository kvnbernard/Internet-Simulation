package test;

import data.Computer;
import data.DNSServer;
import data.IPAddress;
import data.MacAddress;
import data.Mail;
import data.MailServer;
import data.WebServer;
import process.IMAP;
import process.POP;
import process.SMTP;

public class TestInternetResearch {

	public static void main(String[] args) {

	IPAddress ipAddress = new IPAddress("C4-85-08-B2-36-03");
	MacAddress macAddress = new MacAddress("01 32 45 25 62 58");

	Computer computer = new Computer("Laptop","Linux(x64)",macAddress,ipAddress);
    DNSServer dnsServer = new DNSServer("25 35 45 58 65 45");
    WebServer webServer = new WebServer("35 25 45 21 25 36");
    
    computer.toString();
    System.out.println(">>> Requ�te Serveur DNS");
    dnsServer.toString();
    System.out.println("<<< Adresse IP du site internet");
    computer.toString();
    System.out.println(">>> Requ�te Serveur Web");
    webServer.toString();
    System.out.println("<<< Flux html de la page par d�faut");
    computer.toString();
    System.out.println("Affichage des pages web dans le navigateur");
    
    Mail mail= new Mail("AAAAAAAAAAAaa");
    MailServer mailserver= new MailServer("465456445545", "4564");
    SMTP smtp =new SMTP(mailserver, mail);
    POP pop= new POP(mailserver, computer);
    IMAP imap = new IMAP(mailserver, computer);
    System.out.println(imap.request());
    System.out.println(smtp.request());
    System.out.println(pop.request());
    System.out.println(imap.request());
    
	}
}
