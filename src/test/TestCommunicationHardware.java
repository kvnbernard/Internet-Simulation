package test;

import data.ADSL;
import data.FiberOptic;

public class TestCommunicationHardware {
	
	public static void main(String [] args) {
		float userUpldBr=(float) 25;
		float userDwldBr=2;
		int filesize=500;
		String cable;
		ADSL adsluser = null;
		FiberOptic fbuser = null;
		
		if ((userDwldBr<=24) && (userUpldBr<=1)){
			cable="copper wire";
			adsluser= new ADSL(cable, userUpldBr, userDwldBr, filesize);
			System.out.println(adsluser);
		}
		
		else if ((userDwldBr<=1024) && (userUpldBr<=200)){
			cable="glass wire";
			fbuser= new FiberOptic(cable, userUpldBr, userDwldBr, filesize);
			System.out.println(fbuser);
	}
	
	
	}
}