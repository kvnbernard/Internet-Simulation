package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommunicationPanel extends JPanel{

public CommunicationPanel() {
	initpanel();
	
}

private void initpanel() {

	setLayout(null);
	ImageIcon imgdslam = new ImageIcon("./imageGui/Dslam.png");
	ImageIcon imgmodem = new ImageIcon("./imageGui/modem1.png");
	JLabel modem = new JLabel(imgmodem);
	modem.setBounds(new Rectangle(10, 250, 100, 100));

	JLabel dslam = new JLabel(imgdslam);
	dslam.setBounds(new Rectangle(1165, 300, 100, 100));
	add(dslam);
	add(modem);
	setBackground(Color.WHITE);

}


public void paintComponent(Graphics graphics) {
	super.paintComponent(graphics);
	graphics.setColor(Color.RED);
	//laptop-modem
	graphics.drawLine(110, 300, 1165, 350);
}
}
