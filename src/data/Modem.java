package data;

public class Modem extends CommunicationHardware{
	private String frequenceSignal;

    public Modem(String cable, float uploadBitrate, float downloadBitrate, String frequenceSignal ) {
    	  super(cable, downloadBitrate, downloadBitrate);
          this.frequenceSignal=frequenceSignal;
    }

    public String getFrequenceSignal() {
              return frequenceSignal;
    }

    public void setFrequenceSignal(String frequenceSignal) {
              this.frequenceSignal=frequenceSignal;
    }

}
