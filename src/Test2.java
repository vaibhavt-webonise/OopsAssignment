import java.util.Scanner;

public class Test2 
{
	public static void main(String args[]) throws Exception
	{
		int ch,ch1,ch2,ch3;
		Android a;
		Iphone i;
		Samsung s;
		Mi m;
		Iphone8 i8;
		Iphonex ix;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Select The Mobile Version");
			System.out.println("1) Android");
			System.out.println("2) Iphone ");
			System.out.println("3) Exit ");
			System.out.println("Please Select The Choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Select The Sub Android Brand");
					System.out.println("1) Samsung");
					System.out.println("2) MI ");
					System.out.println("Please Enter The Choice");
					ch1=sc.nextInt();
					switch(ch1)
					{
						case 1:
							s=new Samsung();
							s.setSms(true);
							s.setMms(true);
							s.setCall(true);
							System.out.println("Enter The Price Of Phone:?");
							s.setPrice(sc.nextInt());
							System.out.println("Enter The Sim Type Single/Dual:?");
							s.setSimtype(sc.next());
							
							
							System.out.println("Enter The AppStore Phone:?");
							s.setAppStore(sc.next());
							System.out.println("Enter The MemoryCard :?");
							s.setMemoryCard(sc.nextInt());
							System.out.println("Enter The Camera:");
							s.setCamera(sc.nextInt());
							s.setBluetooth(true);
							s.setSamsungPay(true);
							s.printDetails();
							break;
						 default:
							 m=new Mi();
								m.setSms(true);
								m.setMms(true);
								m.setCall(true);
								System.out.println("Enter The Price Of Phone:?");
								m.setPrice(sc.nextInt());
								System.out.println("Enter The Sim Type Single/Dual:?");
								m.setSimtype(sc.next());
								System.out.println("Enter The AppStore Phone:?");
								m.setAppStore(sc.next());
								System.out.println("Enter The MemoryCard :?");
								m.setMemoryCard(sc.nextInt());
								System.out.println("Enter The Camera:");
								m.setCamera(sc.nextInt());
								m.setBluetooth(true);
								m.setMistore(true);
								m.printDetails();
								break;
					}
					break;
				case 2:
					System.out.println("Select The Sub Iphones");
					System.out.println("1) Iphone8");
					System.out.println("2) IphoneX");
					System.out.println("Please Enter The Choice");
					ch1=sc.nextInt();
					switch(ch1)
					{
						case 1:
							i8=new Iphone8();
							i8.setSms(true);
							i8.setMms(true);
							i8.setCall(true);
							System.out.println("Enter The Price Of Phone:?");
							i8.setPrice(sc.nextInt());
							System.out.println("Enter The Sim Type Single/Dual:?");
							i8.setSimtype(sc.next());
							System.out.println("Enter The Colour Of IPhone:?");
							i8.setColour(sc.next());
							System.out.println("Enter The RAM :?");
							i8.setRam(sc.nextInt());
							System.out.println("Enter The ROM:");
							i8.setRom(sc.nextInt());
							i8.setFaceRecognition(true);
							i8.printDetails();
							break;
						 default:
							    ix=new Iphonex();
								ix.setSms(true);
								ix.setMms(true);
								ix.setCall(true);
								System.out.println("Enter The Price Of Phone:?");
								ix.setPrice(sc.nextInt());
								System.out.println("Enter The Sim Type Single/Dual:?");
								ix.setSimtype(sc.next());
								System.out.println("Enter The Colour Of IPhone:?");
								ix.setColour(sc.next());
								System.out.println("Enter The RAM :?");
								ix.setRam(sc.nextInt());
								System.out.println("Enter The ROM:");
								ix.setRom(sc.nextInt());
								ix.setVoiceRecognition(true);
								ix.printDetails();
								break;
					}
					break;
				case 3:
					System.exit(0);
					break;
			}
		}while(ch!=3);
	}
}
