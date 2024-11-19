package data;

public class Peripheral
{
  private String type;
  private String place;
  
  public Peripheral(String type, String place)
  {
    this.type = type;
    this.place = place;
  
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}
@Override
public String toString() {
	return "Peripheral [type=" + type + ", place=" + place + "]";
}

}
