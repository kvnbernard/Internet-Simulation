package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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

public class NetworkPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5789020507063011735L;
	private Computer pc;
	private WebServer webserver;
	private MailServer mailserver= new MailServer("56498585", "IMAP");
	private Mail mail;
	private MacAddress macadress;
	private IPAddress ipadress;
	private ControleGui controlepanel=new ControleGui();
	private JPanel dashboard=new JPanel();
	


	public NetworkPanel() {
		setLayout(new BorderLayout());
		init();
		add(controlepanel,BorderLayout.SOUTH);
		add(dashboard,BorderLayout.CENTER);
		setVisible(true);
		setImage();
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.WHITE);
	
		
	}
	
	public void setImage() {
		ImageIcon imgpc = new ImageIcon("D:\\Ashanth\\Documents\\GLP\\image Gui\\PCfixe.png");
		ImageIcon imgmodem = new ImageIcon("D:\\Ashanth\\Documents\\GLP\\image Gui\\modem.png");
		ImageIcon imgserverweb = new ImageIcon("D:\\Ashanth\\Documents\\GLP\\image Gui\\server.png");
		ImageIcon imgservermail = new ImageIcon("D:\\Ashanth\\Documents\\GLP\\image Gui\\server.png");
		JLabel pc = new JLabel(imgpc);
		JLabel serverweb = new JLabel(imgserverweb);
		JLabel servermail = new JLabel(imgservermail);
		JLabel modem = new JLabel(imgmodem);
		pc.setBounds(new Rectangle(20, 150, 50, 50));
		serverweb.setBounds(new Rectangle(400, 100, 50, 50));
		servermail.setBounds(new Rectangle(400, 200, 50, 50));
		modem.setBounds(new Rectangle(200, 150, 50, 50));
		dashboard.add(pc);
		dashboard.add(serverweb);
		dashboard.add(servermail);
		dashboard.add(modem);
		
	}
	
	public void init() {
		macadress=new MacAddress("1570542031");
		ipadress=new IPAddress("54245782");
		pc=new Computer("pcportable", "linux", macadress, ipadress);
		webserver=new WebServer("46531203615");
		dashboard.setLayout(null);
		
		
	}
	
	

	
	

}














