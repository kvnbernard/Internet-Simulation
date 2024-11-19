package data;

public class Data
{
  private String address;
  
  public Data(String address)
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
	return "Data [address=" + address + "]";
}
  
}
