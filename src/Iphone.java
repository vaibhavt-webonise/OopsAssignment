
public class Iphone extends Mobile
{
	String colour;//= {"White","Black","Gold","RoseGold","Silver"};
	int rom;//= {32,64,128,256};
	int ram;//= {8,16,32};
	public Iphone()
	{
		
	}
	/*public Iphone(String color,int rom,int ram)
	{
		//super(true,true,true,15000,"Single");
		setColour(color);
		setRom(rom);
		setRam(ram);
	}*/
	void setColour(String color)
	{
		this.colour=color;
	}
	void setRom(int rom)
	{
		this.rom=rom;
	}
	void setRam(int ram)
	{
		this.ram=ram;
	}
	String getColour()
	{
		return this.colour;
	}
	int getRom()
	{
		return this.rom;
	}
	int getRam()
	{
		return this.ram;
	}/*
	public static void main(String args[])
	{
		Iphone i=new Iphone("Rose Gold",32,256);
		System.out.println("Sms: "+i.getSms());
		System.out.println("Mms: "+i.getMms());
		System.out.println("Call: "+i.getCall());
		System.out.println("Price: "+i.getPrice());
		System.out.println("Sim Type: "+i.getSimtype());
		System.out.println("Colour: "+i.getColour());
		System.out.println("Rom: "+i.getRom());
		System.out.println("Ram: "+i.getRam());
	}*/
}
