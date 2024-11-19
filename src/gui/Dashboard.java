package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JPanel implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6414255962439625787L;
	private Dashboard  instance = this;
	private JLabel laptop;
	private Color lineColor;

	public Dashboard() {
		setBackground(Color.WHITE);
		initImage();
		initTag();
		setLayout(null);
		lineColor = Color.black;
	}
	
	
	public void initTag() {
		
		JLabel laptop = new JLabel("Laptop");
		JLabel phone = new JLabel("Mobile Phone");
		JLabel antenna = new JLabel("Antenna");
		JLabel dslam = new JLabel("Dslam");
		JLabel serverdns = new JLabel("DNSServer");
		JLabel serverweb = new JLabel("WebServer");
		JLabel serverweb1 = new JLabel("WebServer");
		JLabel serverweb2 = new JLabel("WebServer");
		JLabel sattelite = new JLabel("Sattelite");
		JLabel servermail = new JLabel("MailServer");
		JLabel pc = new JLabel("Computer");
		JLabel local2 = new JLabel("Computers");
		JLabel modem = new JLabel("Modem");
		JLabel router = new JLabel("Router");
		JLabel modemWireless = new JLabel("ModemWireless");
		
		antenna.setBounds(new Rectangle(725, 600, 100, 100)); 
		laptop.setBounds(new Rectangle(37, 129, 100, 100));
		serverdns.setBounds(new Rectangle(1165, 150, 100, 100));
		serverweb.setBounds(new Rectangle(1165, 250, 100, 100));
		serverweb1.setBounds(new Rectangle(1165, 350, 100, 100));
		serverweb2.setBounds(new Rectangle(1165, 450, 100, 100));
		servermail.setBounds(new Rectangle(1165, 550, 100, 100));
		pc.setBounds(new Rectangle(29, 288, 100, 100));
		local2.setBounds(new Rectangle(95, 428, 100, 100));
		phone.setBounds(new Rectangle(88, 530, 100, 100));
		sattelite.setBounds(new Rectangle(720, 53, 100, 100));
		dslam.setBounds(new Rectangle(1032, 340, 100, 100));
		modem.setBounds(new Rectangle(447, 227, 100, 100));
		modemWireless.setBounds(new Rectangle(423, 385, 100, 100));
		router.setBounds(new Rectangle(450, 72, 100, 100));
		
		add(laptop);
		add(local2);
		add(phone);
		add(serverdns);
		add(serverweb);
		add(serverweb1);
		add(serverweb2);
		add(servermail);
		add(pc);
		add(sattelite);
		add(dslam);
		add(antenna);
		add(modem);
		add(modemWireless);
		add(router);
	}
	
	
	public void initImage() {
		
		ImageIcon imglaptop = new ImageIcon("./imageGui/laptop1.png");
		ImageIcon imgpc = new ImageIcon("./imageGui/pc.png");
		ImageIcon imgmodem = new ImageIcon("./imageGui/modem1.png");
		ImageIcon imgrouter = new ImageIcon("./imageGui/router.png");
		ImageIcon imgmodemWireless = new ImageIcon("./imageGui/modemWireless.png");
		ImageIcon imgdslam = new ImageIcon("./imageGui/dslam.png");
		ImageIcon imgphone = new ImageIcon("./imageGui/phone.png");
		ImageIcon imgantenna = new ImageIcon("./imageGui/antenna.png");
		ImageIcon imgsattelite = new ImageIcon("./imageGui/sattelite.png");
		ImageIcon imgserverdns = new ImageIcon("./imageGui/DNSserver.png");
		ImageIcon imgserverweb = new ImageIcon("./imageGui/webserver.png");
		ImageIcon imgservermail = new ImageIcon("./imageGui/mailserver.png");
			
		 laptop = new JLabel(imglaptop);
		JLabel phone = new JLabel(imgphone);
		JLabel antenna = new JLabel(imgantenna);
		JLabel dslam = new JLabel(imgdslam);
		JLabel serverdns = new JLabel(imgserverdns);
		JLabel serverweb = new JLabel(imgserverweb);
		JLabel serverweb1 = new JLabel(imgserverweb);
		JLabel serverweb2 = new JLabel(imgserverweb);
		JLabel sattelite = new JLabel(imgsattelite);
		JLabel servermail = new JLabel(imgservermail);
		JLabel pc = new JLabel(imgpc);
		JLabel local1 = new JLabel(imgpc);
		JLabel local2 = new JLabel(imgpc);
		JLabel local3 = new JLabel(imgpc);
		JLabel modem = new JLabel(imgmodem);
		JLabel router = new JLabel(imgrouter);
		JLabel modemWireless = new JLabel(imgmodemWireless);
		
		antenna.setBounds(new Rectangle(700, 550, 100, 100));
		laptop.setBounds(new Rectangle(10, 100, 100, 100));
		serverdns.setBounds(new Rectangle(1150, 100, 100, 100));
		serverweb.setBounds(new Rectangle(1150, 200, 100, 100));
		serverweb1.setBounds(new Rectangle(1150, 300, 100, 100));
		serverweb2.setBounds(new Rectangle(1150, 400, 100, 100));
		servermail.setBounds(new Rectangle(1150, 500, 100, 100));
		pc.setBounds(new Rectangle(10, 250, 100, 100));
		local1.setBounds(new Rectangle(10, 390, 100, 100));
		local2.setBounds(new Rectangle(80, 390, 100, 100));
		local3.setBounds(new Rectangle(150, 390, 100, 100));
		phone.setBounds(new Rectangle(80, 490, 100, 100));
		sattelite.setBounds(new Rectangle(700, 10, 100, 100));
		dslam.setBounds(new Rectangle(1000, 300, 100, 100));
		modem.setBounds(new Rectangle(420, 200, 100, 100));
		modemWireless.setBounds(new Rectangle(420, 350, 100, 100));
		router.setBounds(new Rectangle(420, 50, 100, 100));
		
		add(laptop);
		add(local1);
		add(local2);
		add(local3);
		add(phone);
		add(serverdns);
		add(serverweb);
		add(serverweb1);
		add(serverweb2);
		add(servermail);
		add(pc);
		add(sattelite);
		add(dslam);
		add(antenna);
		add(modem);
		add(modemWireless);
		add(router);
	}
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		graphics.setColor(lineColor);
		//laptop-modem
		graphics.drawLine(110,150,420,250);
		//computer-router
		graphics.drawLine(110, 300, 420, 100);
		//computer-modem
		graphics.drawLine(110, 300, 420, 400);
		//router-modem
		graphics.drawLine(470, 140, 470, 210);
		//modem-modemWireless
		graphics.drawLine(470, 300, 470, 350);
		//modemWireless-antenna
		graphics.drawLine(470, 450, 470, 600);
		graphics.drawLine(700, 600, 130, 600);
		graphics.drawLine(130, 590, 130, 600); 
		//modem-DSLAM
		graphics.drawLine(520, 250, 1000, 350);
		graphics.drawLine(1150, 250, 1108, 350);
		//webserver
		graphics.drawLine(1150, 350, 1108, 350);
		//DSLAM-webserver3
		graphics.drawLine(1150, 450, 1108, 350);
		//DSLAM-node1
		graphics.drawLine(1090, 350, 1108, 350);
		//dnsserver-node2
		graphics.drawLine(1150, 150, 1050, 150);
		//node2-DSLAM
		graphics.drawLine(1050, 300, 1050, 150);
		//mailserver-node3
		graphics.drawLine(1150, 550, 1050, 550);
		//node3-DSLAM
		graphics.drawLine(1050, 550, 1050, 400);
		//dnsserver-node4
		graphics.drawLine(1270, 150, 1250, 150);
		//ligne reliant node4 et node5
		graphics.drawLine(1270, 150, 1270, 650);
		//node7-node8
		graphics.drawLine(1270, 650, 875, 650);
		//node8-node9
		graphics.drawLine(875, 650, 875, 600);
		//node9-antenna
		graphics.drawLine(875, 600, 800, 600);
		//node5-webser
		graphics.drawLine(1250, 250, 1270, 250);
	}
	public void changeLineColor()
	{
		this.lineColor = Color.RED;
	}
	public String getLineColor()
	{
		String color="";
		System.out.println("After color changement");
		if(lineColor == Color.RED)
		{
			color += ">>> Line color : red";
		}
		return color;
	}
	public void color() {
		
		removeAll();;
		this.revalidate();
		this.repaint();
		System.out.println("ggg");
		
	}
	public Dashboard getInstanceDash() {
		return instance;
	}


	public void setInstance(Dashboard instance) {
		this.instance = instance;
	}


	@Override
	public void run() {
	JPanel computer = new JPanel();
	computer.setSize(getMaximumSize());
	add(computer);
		
	}
	
}
