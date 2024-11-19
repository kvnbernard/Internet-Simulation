package data;

public class Telecommunication {
	
	private String antenna;
	private float bitrate;
	private long frequency;
	
	public Telecommunication(String antenna, float bitrate, long frequency) {
		this.antenna = antenna;
		this.bitrate = bitrate;
		this.frequency = frequency;
	}

	public String getAntenna() {
		return antenna;
	}

	public void setAntenna(String antenna) {
		this.antenna = antenna;
	}

	public float getBitrate() {
		return bitrate;
	}

	public void setBitrate(float bitrate) {
		this.bitrate = bitrate;
	}

	public long getFrequency() {
		return frequency;
	}

	public void setFrequency(long frequency) {
		this.frequency = frequency;
	}
	

}
