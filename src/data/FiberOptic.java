package data;

public class FiberOptic extends CommunicationHardware {

private float maxDownloadBitrate=1024;
	private float maxUploadBitrate=200;

	public FiberOptic(String cable, float uploadBitrate, float downloadBitrate, int filesize) {
		super(cable, uploadBitrate, downloadBitrate, filesize);
	}
	
	public FiberOptic(String cable, float uploadBitrate, float downloadBitrate) {
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
		 return "FiberOptic of the user:\nComposition of cables: " + getCable() + "\nMaxDownloadBitrate: " + getMaxDownloadBitrate() + " Mbps\n" + "MaxUploadBitrate " + getMaxUploadBitrate()  + " Mbps\n" + "DownloadBitrate: " + getDownloadBitrate() + " Mbps\n" + "UploadBitrate; " + getUploadBitrate() +" Mbps\n";
	}
	
	
}