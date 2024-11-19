package data;

public class CommunicationHardware {

	private String cable;
	private float uploadBitrate;
	private float downloadBitrate;
	private int filesize;	
	
	
	public CommunicationHardware(String cable, float uploadBitrate, float downloadBitrate, int filesize) {
		super();
		this.cable = cable;
		this.uploadBitrate = uploadBitrate;
		this.downloadBitrate = downloadBitrate;
		this.filesize = filesize;
	}


	public CommunicationHardware(String cable, float uploadBitrate, float downloadBitrate) {
		super();
		this.cable = cable;
		this.uploadBitrate = uploadBitrate;
		this.downloadBitrate = downloadBitrate;
	}


	public String getCable() {
		return cable;
	}

	
	public void setCable(String cable) {
		this.cable = cable;
	}


	public float getUploadBitrate() {
		return uploadBitrate;
	}


	public void setUploadBitrate(int uploadBitrate) {
		this.uploadBitrate = uploadBitrate;
	}


	public float getDownloadBitrate() {
		return downloadBitrate;
	}


	public void setDownloadBitrate(int downloadBitrate) {
		this.downloadBitrate = downloadBitrate;
	}


	public int getFilesize() {
		return filesize;
	}


	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	
}