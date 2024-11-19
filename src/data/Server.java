package data;

public class Server
{
  private String address;
  
  public Server(String address)
  {
    this.address = address;
  }

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Server [address=" + address + "]";
}
}
