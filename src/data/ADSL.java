package data;

public class ADSL extends CommunicationHardware{
	
	private float maxDownloadBitrate=24;
	private float maxUploadBitrate=1;

	public ADSL(String cable, float uploadBitrate, float downloadBitrate, int filesize) {
		super(cable, uploadBitrate, downloadBitrate, filesize);
	}
	
	public ADSL(String cable, float uploadBitrate, float downloadBitrate) {
		super(cable, uploadBitrate, downloadBitrate);
	}

	public float getMaxDownloadBitrate() {
		return maxDownloadBitrate;
	}

	public float getMaxUploadBitrate() {
		return maxUploadBitrate;
	}

	@Override
	public String toString() {
		return "ADSL of the user:\nComposition of cables: " + getCable() + "\nMaxDownloadBitrate: " + getMaxDownloadBitrate() + " Mbps\n" + "MaxUploadBitrate " + getMaxUploadBitrate()  + " Mbps\n" + "DownloadBitrate: " + getDownloadBitrate() + " Mbps\n" + "UploadBitrate; " + getUploadBitrate() +" Mbps\n";
	}
	
	
	
}