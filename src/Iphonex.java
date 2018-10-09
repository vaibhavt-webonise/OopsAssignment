public class Iphonex  extends Iphone
{
	private boolean VoiceRecognition;
	void setVoiceRecognition(boolean value)
	{
		this.VoiceRecognition=value;
	}
	boolean getVoiceRecognition()
	{
		return this.VoiceRecognition;
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
		System.out.println("Iphonex Features Are:"+"\n");
		System.out.println("VoiceRecognition: "+getVoiceRecognition());
	}
}