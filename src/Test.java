import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	
	public static void main(String[] args) throws IOException{
		
		int mobileOSChoice,androidChoice;
		Android android;
		Iphone iphone;
		Samsung samsung;
		Lenovo lenovo;
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1) Android");
		System.out.println("2) IOS");
		System.out.println("Enter Mobile Operating System Choice:");
		mobileOSChoice=Integer.parseInt(bufferedReader.readLine());
		switch(mobileOSChoice)
		{
			case 1:
				System.out.println("1) Samsung");
				System.out.println("2) Lenovo");
				System.out.println("Enter Android Brand:");
				androidChoice=Integer.parseInt(bufferedReader.readLine());
				switch(androidChoice)
				{
					case 1:
						samsung=new Samsung();
						samsung.setbluetoothMode(true);
						samsung.setCameraPixel(13);
						samsung.setColour("Black");
						samsung.setmapsType("Google");
						samsung.setPrice(15000);
						samsung.setRamMemory(8);
						samsung.setSimType("Dual");
						samsung.setChatonVersion(2.2);
						
						System.out.println("Samsung Mobile Phone Details Are....");
						System.out.println("Bluetooth Mode:"+samsung.getbluetoothMode());
						System.out.println("Camera:"+samsung.getCameraPixel()+"px");
						System.out.println("Colour:"+samsung.getColour());
						System.out.println("RAM:"+samsung.getRam()+"GB");
						System.out.println("Maps:"+samsung.getmapsType());
						System.out.println("Sim Type:"+samsung.getSimType());
						System.out.println("Samsung Chat On Version:"+samsung.getChatonVersion());
						System.out.println("Price:"+samsung.getPrice("Black",8));
						break;
					case 2:
						lenovo=new Lenovo();
						lenovo.setbluetoothMode(false);
						lenovo.setCameraPixel(17);
						lenovo.setColour("Rose Gold");
						lenovo.setmapsType("Apple");
						lenovo.setPrice(74000);
						lenovo.setRamMemory(16);
						lenovo.setSimType("Single");
						lenovo.setLenovoVersion(4.2);
						
						System.out.println("Lenovo Mobile Phone Details Are....");
						System.out.println("Bluetooth Mode:"+lenovo.getbluetoothMode());
						System.out.println("Camera:"+lenovo.getCameraPixel()+"px");
						System.out.println("Colour:"+lenovo.getColour());
						System.out.println("RAM:"+lenovo.getRam()+"GB");
						System.out.println("Maps:"+lenovo.getmapsType());
						System.out.println("Sim Type:"+lenovo.getSimType());
						System.out.println("Lenovo Version:"+lenovo.getLenovoVersion());
						System.out.println("Price:"+lenovo.getPrice("Rose Gold"));
						break;
				}
		}
	}

}
