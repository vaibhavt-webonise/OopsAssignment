import java.util.Scanner;

public class Mobile 
{
	boolean sms,mms,call;
	int price;
	String simtype;
	Scanner sc=new Scanner(System.in);
	char ch;
	public Mobile()
	{
			
	}
	
	public void setSms(boolean value)
	{
		this.sms=value;
	}
	public void setMms(boolean value)
	{
		this.mms=value;
	}
	public void setCall(boolean value)
	{
		this.call=value;
	}
	public void setPrice(int value)
	{
		this.price=value;
	}
	public void setSimtype(String value)
	{
		this.simtype=value;
	}
	public boolean getSms()
	{
		return this.sms;
	}
	public boolean getMms()
	{
		return this.mms;
	}
	public boolean getCall()
	{
		return this.call;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getSimtype()
	{
		return this.simtype;
	}
	
	/*public static void main(String args[])
	{
		Mobile m=new Mobile();
		m.setSms(true);
		m.setMms(false);
		System.out.println(m.getSms());
		System.out.println(m.getMms());
	}*/
}
