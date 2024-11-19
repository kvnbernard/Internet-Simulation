package data;

import java.util.ArrayList;

public class Computer extends TerminalNetworkingDevice
{
  private String systemType;
  private MacAddress macAddress;
  private IPAddress ipAddress;
  private ArrayList<Mail> mail;
  
  public Computer(String name,String systemType, MacAddress macAddress, IPAddress ipAddress)
  {
    super(name);
    this.systemType = systemType;
    this.macAddress = macAddress;
    this.ipAddress = ipAddress;
  }

public String getSystemType() {
	return systemType;
}

public void setSystemType(String systemType) {
	this.systemType = systemType;
}

public MacAddress getMacAddress() {
	return macAddress;
}

public void setMacAddress(MacAddress macAddress) {
	this.macAddress = macAddress;
}

public IPAddress getIpAddress() {
	return ipAddress;
}

public void setIpAddress(IPAddress ipAddress) {
	this.ipAddress = ipAddress;
}

public void setMail(ArrayList<Mail> mail) {
	this.mail = mail;
}

@Override
public String toString() {
	return "Computer [systemType=" + systemType + ", macAddress=" + macAddress + ", ipAddress=" + ipAddress + "]";
}

}
