package test;

import data.Computer;
import data.DNSServer;
import data.IPAddress;
import data.MacAddress;
import data.WebServer;

public class TestInternetResearsh {

	public static void main(String[] args) {

	IPAddress ipAddress = new IPAddress("C4-85-08-B2-36-03");
	MacAddress macAddress = new MacAddress("01 32 45 25 62 58");

	Computer computer = new Computer("Laptop","Linux(x64)",macAddress,ipAddress);
    DNSServer dnsServer = new DNSServer("25 35 45 58 65 45");
    WebServer webServer = new WebServer("35 25 45 21 25 36");
    
    computer.toString();
    System.out.println(">>> Requête Serveur DNS");
    dnsServer.toString();
    System.out.println("<<< Adresse IP du site internet");
    computer.toString();
    System.out.println(">>> Requête Serveur Web");
    webServer.toString();
    System.out.println("<<< Flux html de la page par défaut");
    computer.toString();
    System.out.println("Affichage des pages web dans le navigateur");
	}
}
