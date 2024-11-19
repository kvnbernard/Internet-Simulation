package process;

import data.ADSL;
import data.FiberOptic;

public class Duration {
	
	private ADSL adsl;
	private FiberOptic fiber;
	private int filesize;
	private float downloadBitrate;
	private float uploadBitrate;
	
	
		public Duration(float userUpldBr, float userDwldBr , int filesize) {
			
			if ((userDwldBr<=24) && (userUpldBr<=1)){
				String cable="copper wire";
				this.adsl= new ADSL(cable, userUpldBr, userDwldBr, filesize);
				this.filesize=filesize;
				this.downloadBitrate=userDwldBr;
				this.uploadBitrate=userUpldBr;
			}
	
			else if ((userDwldBr<=1024) && (userUpldBr<=200)){
				String cable="glass wire";
				this.fiber= new FiberOptic(cable, userUpldBr, userDwldBr, filesize);
				this.filesize=filesize;
				this.downloadBitrate=userDwldBr;
				this.uploadBitrate=userUpldBr;
			}
		}
		
		public String downloadDuration() {
			String result=null;
			float duration;
			duration=filesize/(downloadBitrate/10);
			if (duration>60) {
				duration/=60;
				result="Download duration is: " + duration + " minute";
			}
			else { 
				result="Download duration is: " + duration + " second";
			}
			return result;
			}
			
			
		public String uploadDuration() {
			String result=null;
			float duration;
			duration=filesize/(uploadBitrate/10);
			if (duration>60) {
				duration/=60;
				result="Upload duration is: " + duration + " minute";
			}
			else { 
				result="Upload duration is: " + duration + " second";
			}
			return result;
			}
}