
public interface MobilePhone 
{
	public void setCameraPixel(int value);
	public void setSimType(String value);
	public void setRamMemory(int value);
	public void setColour(String value);
	public int getPrice();
	public int getPrice(String Colour);
	public int getPrice(String Colour,int ram);
}
