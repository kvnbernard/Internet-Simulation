package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.Computer;
import data.IPAddress;
import data.MacAddress;
import data.Mail;
import data.MailServer;
import data.WebServer;
import process.HTTP;
import process.SMTP;

public class ControleGui extends JPanel implements
ActionListener{
JButton http;
JTextField httpsource;
String field;
	
	public ControleGui() {
	setPreferredSize(new Dimension(500, 150));
	setBackground(new Color(220, 220, 220));
	initButton();
	}

	public JButton getHttp() {
		return http;
	}
	public void initButton() {
		http= new JButton("HTTP");
		http.addActionListener(this);
		JTextField httpsource =new JTextField();
		add(http);
		httpsource.setColumns(20);
		add(httpsource);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stu
			Object source= e.getSource();
		if (source==http) {
			MacAddress macadress = new MacAddress("1570542031");
			IPAddress ipadress = new IPAddress("1.160.10.567");
			Computer pc = new Computer("pcportable", "linux", macadress, ipadress);
			WebServer webserver = new WebServer("46531203615");
			HTTP httptest= new HTTP(pc, webserver, ipadress);
			System.out.println( httptest.request());
		
			
		}
	
}
		
	}
	
	
	
