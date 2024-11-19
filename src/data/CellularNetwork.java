package data;

public class CellularNetwork extends Telecommunication{

	public CellularNetwork(String antenna, float bitrate, long frequency) {
		super(antenna, bitrate, frequency);
	}

	public String typeOfCellularNetwork () {
		String type = null;
		if (getBitrate()<0.144) {
			type= "Type of CellularNetwork : 4G";
		}
		else {
			type= "Type of CellularNetwork : 3G";
		}
		return type;
	}
	
}
