
public class Iphone8  extends Iphone
{
	private boolean FaceRecognition;
	void setFaceRecognition(boolean value)
	{
		this.FaceRecognition=value;
	}
	boolean getFaceRecognition()
	{
		return this.FaceRecognition;
	}
	void printDetails()
	{
		System.out.println("Mobile Features Are:");
		System.out.println("SMS: "+getSms());
		System.out.println("MMS: "+getMms());
		System.out.println("Call: "+getCall());
		System.out.println("Price: "+getPrice());
		System.out.println("SimType: "+getSimtype()+"\n");
		System.out.println("Iphone Features Are:");
		System.out.println("Colour: "+getColour());
		System.out.println("Ram: "+getRam());
		System.out.println("Rom: "+getRom());
		System.out.println("Iphone8 Features Are:"+"\n");
		System.out.println("FaceRecognition: "+getFaceRecognition());
	}
}
