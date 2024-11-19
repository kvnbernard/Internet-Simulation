package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI extends JFrame implements Runnable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 2293839244136254653L;
	private MainGUI instance = this;
	private Dashboard dashboard;
	private InformationZone informationZone;
	private OperationZone operationZone;
	private int counter=1;
	private CommunicationPanel paneltry;
	
	private boolean stop = true;
	
	public MainGUI() {
		super("Graphical Network Visualisation");
		dashboard = new Dashboard();
		informationZone= new InformationZone();
		//operationZone = new OperationZone(dashboard);
		operationZone = new OperationZone(instance);
		initLayout();
		
	}

	private void initLayout() {
		
		setLayout(new BorderLayout());
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().add(dashboard,BorderLayout.CENTER);
		getContentPane().add(informationZone,BorderLayout.SOUTH);
		getContentPane().add(operationZone,BorderLayout.EAST);
	}

	@Override
	public void run() {
		int time = 0;

		while (time <= SimuPara.SIMULATION_DURATION) {
/*		counter++;
		if (counter%2==0) {
		remove(dashboard);
		paneltry = new CommunicationPanel();
		getContentPane().add(paneltry);
		
		}
		
		else { 
			remove(paneltry);
			add(dashboard);
			}
		this.revalidate();
		this.repaint();*/
		
//		while (!stop) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					System.out.println(e.getMessage());
//				}
//				chronometer.increment();
				
				// Ensure that the chronometer is not stopped during the iteration.
//				if (!stop) {
					updateValues();
//				}
//			}
			time++;
		}
	}
	private void updateValues() { 
		dashboard.changeLineColor();
		dashboard.getLineColor();
		// The dashboard needs to be reprinted when hour, minute or second values change.
		this.revalidate();
		this.repaint();
	}
}