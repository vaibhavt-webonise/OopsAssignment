
public class Mi extends Android
{
	private boolean mistore;
	
	void setMistore(boolean value)
	{
		this.mistore=value;
	}
	boolean getMistore()
	{
		return this.mistore;
	}
	void printDetails()
	{
		System.out.println("Mobile Features Are:");
		System.out.println("SMS: "+getSms());
		System.out.println("MMS: "+getMms());
		System.out.println("Call: "+getCall());
		System.out.println("Price: "+getPrice());
		System.out.println("SimType: "+getSimtype()+"\n");
		System.out.println("Android Features Are:");
		System.out.println("Bluetooth: "+getBluetooth());
		System.out.println("AppStore: "+getAppStore());
		System.out.println("MemoryCard: "+getMemoryCard());
		System.out.println("Camera: "+getCamera()+"\n");
		System.out.println("Mi Features Are:");
		System.out.println("MiStore Features are: "+getMistore());
	}
}
