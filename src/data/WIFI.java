package data;

public class WIFI extends Telecommunication {
	
	private MacAddress macAdress;
	private String router;
	private String modem;

	public WIFI(String antenna, float bitrate, long frequency) {
		super(antenna, bitrate, frequency);
	}
	
	public WIFI(String antenna, float bitrate, long frequency, String router, String modem, MacAddress macAdress) {
		super(antenna, bitrate, frequency);
		this.macAdress=macAdress;
		this.modem=modem;
		this.router=router;
	}

	public MacAddress getMacAdress() {
		return macAdress;
	}

	public void setMacAdress(MacAddress macAdress) {
		this.macAdress = macAdress;
	}

	public String getRouter() {
		return router;
	}

	public void setRouter(String router) {
		this.router = router;
	}

	public String getModem() {
		return modem;
	}

	public void setModem(String modem) {
		this.modem = modem;
	}


}
