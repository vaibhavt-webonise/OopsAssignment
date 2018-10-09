
public class Android extends Mobile
{
	String appStore;
	boolean bluetooth;
	int memorycard,camera;
	public Android()
	{
		
	}
	void setAppStore(String value)
	{
		this.appStore=value;
	}
	void setBluetooth(boolean value)
	{
		this.bluetooth=value;
	}
	void setMemoryCard(int value)
	{
		this.memorycard=value;
	}
	void setCamera(int value)
	{
		this.camera=value;
	}
	
	String getAppStore()
	{
		return this.appStore;
	}
	boolean getBluetooth()
	{
		return this.bluetooth;
	}
	int getMemoryCard()
	{
		return this.memorycard;
	}
	int getCamera()
	{
		return this.camera;
	}
}
