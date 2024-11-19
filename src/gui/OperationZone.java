package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.nio.sctp.SendFailedNotification;


public class OperationZone extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1723645190821193574L;
	private JButton panel;
	private Dashboard dashboard;
	private JTextField mail;
	private MainGUI main;
	private JButton sendmailButton=new JButton("Start");
	private JButton websiteButton=new JButton("Start");
	
	private JLabel websiteLabel=new JLabel("Go to (www.u-cergy.fr)");
	private JLabel sendmailLabel=new JLabel("Send mail");
	
	public OperationZone(Dashboard dash) {
		this.dashboard=dash;
		setPreferredSize(new Dimension(250, 1000));
		setBackground(Color.decode("#bdc3c7"));
		initOperation();
		panelchange();
	}
	
	public OperationZone(MainGUI instance) {
		// TODO Auto-generated constructor stub
		this.main=instance;
		setPreferredSize(new Dimension(250, 1000));
		setBackground(Color.decode("#bdc3c7"));
		initOperation();
		panelchange();
	
	}
	
	public void  initOperation() { 
		
		panel=new JButton("See Communication");
		//JTextField web=new JTextField("Type Website's IPAdress",10);
		mail=new JTextField(10);
		add(sendmailButton);
//		add(mail);
		add(websiteButton);
		add(panel);
	}
	
	public void panelchange() {
		panel.addActionListener(new ButtonAction());
		websiteButton.addActionListener(new WebSearchAction());
		sendmailButton.addActionListener(new SendMailAction());
	}
	private class ButtonAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (panel==e.getSource()) {

				Thread change = new Thread(main);
				change.start();
				
			}
		}
	}
	private class WebSearchAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
	/*		if (!stop) {
				stop = true;
				websiteButton.setText(" Start ");
			} else {
				stop = false;
				websiteButton.setText(" Pause ");*/
				Thread thread = new Thread(main);
				thread.start();
			//}
		}
	}
	private class SendMailAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			if (!stop) {
//				stop = true;
//				sendmailButton.setText(" Start ");
//			} else {
//				stop = false;
//				sendmailButton.setText(" Pause ");
				Thread thread = new Thread(main);
				thread.start();
//			}
		}
	}
}
