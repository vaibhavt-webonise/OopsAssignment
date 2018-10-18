
public class Android implements MobilePhone
{
	int cameraPixel,ram,price;
	String simType,colour,mapsType;
	boolean bluetoothMode;
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
	public void setmapsType(String value) {
		this.mapsType=value;
	}
	public void setbluetoothMode(boolean value) {
		this.bluetoothMode=value;
	}
	boolean getbluetoothMode()
	{
		return this.bluetoothMode;
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
	String getmapsType()
	{
		return mapsType;
	}
	boolean setbluetoothMode()
	{
		return bluetoothMode;
	}
	public void setPrice(int value)
	{
		this.price=value;
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
	
	
}
