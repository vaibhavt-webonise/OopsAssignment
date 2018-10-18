
public class Iphone implements MobilePhone
{
	int cameraPixel,ram,price;
	String simType,colour,version,iphoneModel;
	@Override
	public void setCameraPixel(int value) {
		this.cameraPixel=value;
	}
	@Override
	public void setSimType(String value) {
		this.simType=value;
	}
	@Override
	public void setRamMemory(int value) {
		this.ram=value;
	}
	@Override
	public void setColour(String value) {
		this.colour=value;
	}
	public void setVersion(String value) {
		this.version=value;
	}
	public void setiphoneModel(String value) {
		this.iphoneModel=value;
	}
	public void setPrice(int value)
	{
		this.price=value;
	}
	String getVersion()
	{
		return this.version;
	}
	String getiphoneModel()
	{
		return iphoneModel;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	@Override
	public int getPrice(String Colour) {
		// TODO Auto-generated method stub
		return this.price+1500;
	}
	@Override
	public int getPrice(String Colour, int ram) {
		// TODO Auto-generated method stub
		return this.price+3000;
	}
	String getSimType()
	{
		return this.simType;
	}
	int getRam()
	{
		return this.ram;
	}
	String getColour()
	{
		return this.colour;
	}
	int getCameraPixel()
	{
		return this.cameraPixel;
	}

}
