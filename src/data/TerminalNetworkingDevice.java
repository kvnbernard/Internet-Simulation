package data;

public class TerminalNetworkingDevice
{
  private String name;
  
  public TerminalNetworkingDevice(String name)
  {
    this.name = name;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "TerminalNetworkingDevice [name=" + name + "]";
}
  
}
