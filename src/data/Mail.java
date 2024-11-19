package data;

public class Mail extends Data
{
  public Mail(String mailsubject)
  {
    super(mailsubject);
  }

@Override
public String toString() {
	return "Mail [Subjet of the mail= " + getAddress() + "]";
}
  
  
  
  
  
}
