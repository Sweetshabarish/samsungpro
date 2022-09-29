package samsung;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 *  interface class where all the samsung s series phone contains some same features.
 */
interface Phone{
    
    int ram();
    String cameraSetUp();
    String notch();
}
interface fetauress{
	public String Screendisplay() ;
	public String storage();
	public String networktype();
	public String revloution() ;

	public static int price(int ram,int storage) {
		return ram+storage;
	}

}
/*
 * singleton class ,were s series contains same version at starting time in all phones, we can change version or update
 */
class version{
    String version1 = "oxygen";
    int versionnumber = 10;
    private static version obj;

    private version(){}

    public static version getInstance(){
        if(obj==null)
            obj = new version();
        return obj;
    }
}
       
public class samssungmain {
		
	public static void main(String[] args) {
		int choise =0;
		
		Scanner input=new Scanner(System.in) ;// scanner class to get input from the user
		System.out.println("Enter user name");	// user name from the user
		String username=input.next();
		System.out.println("Enter user password");	//password from the userr
		String password=input.next();
		user object1=new user();
		boolean process=true;
		/*
		 * here the main fetures of the mobile will be displayed
		 */
		if(object1.checking(username, password)) {
			while(process) {
			System.out.println("Continue to see the fetaures reg");
			System.out.println("1. Samsung s20");
			System.out.println("2. Samsung s20plus");
			System.out.println("3. Samsung s20plusUltra");
			System.out.println("4. Sasmsung se");
			System.out.println("5. Exit");
			
			try {                                     //this try catch is used bec., to check the userinput wheather he entered string or integer,he need to enter in in format
				choise=input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("enter the correct suitable case");
			}
			
			if(choise==1) {
				/*
				 * display the samsungs20 features
				 */
				Samsungs20 obj1=new Samsungs20();
				version obje1=version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				
				System.out.println("USer name:"+obj1.getUserName());
				System.out.println("User Phone Number:"+obj1.getphonenumber());
				System.out.println("Storage:"+obj1.storage());
				System.out.println("Ram size:"+obj1.ram());
				System.out.println("Camera set up:"+obj1.cameraSetUp());
				System.out.println("Notch:"+obj1.notch());
				System.out.println("Screen Display:"+obj1.Screendisplay());
				System.out.println("NetworkType:"+obj1.networktype());
				System.out.println("Revolution:"+obj1.revloution());
				obj1.power();
				obj1.chipModel();
				System.out.println("Version:"+obje1.version1+"  Version number:"+obje1.versionnumber);
				System.out.println("Total price of the set:"+obj1.price(512));
				System.out.println();
				System.out.println("==================================================================");
				
				
			}
			else if(choise==2) {
				/*
				 * display the samsungs20plus features
				 */
				Smasungs20plus obj2=new Smasungs20plus();
				version obje2=version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("USer name:"+obj2.getUserName());
				System.out.println("User Phone Number:"+obj2.getphonenumber());
				System.out.println("Storage:"+obj2.storage());
				System.out.println("Ram size:"+obj2.ram());
				System.out.println("Camera set up:"+obj2.cameraSetUp());
				System.out.println("Notch:"+obj2.notch());
				System.out.println("Screen Display:"+obj2.Screendisplay());
				System.out.println("NetworkType:"+obj2.networktype());
				System.out.println("Revolution:"+obj2.revloution());
				obj2.power();
				obj2.chipModel();
				System.out.println("Version:"+obje2.version1+"  Version number:"+obje2.versionnumber);
				System.out.println("Total price of the set:"+obj2.price(128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise==3) {
				/*
				 * display the samsungs20plusultra features
				 */
				Smasungs20plusultra obj3=new Smasungs20plusultra();
				version obje3=version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("USer name:"+obj3.getUserName());
				System.out.println("User Phone Number:"+obj3.getphonenumber());
				System.out.println("Storage:"+obj3.storage());
				System.out.println("Ram size:"+obj3.ram());
				System.out.println("Camera set up:"+obj3.cameraSetUp());
				System.out.println("Notch:"+obj3.notch());
				System.out.println("Screen Display:"+obj3.Screendisplay());
				System.out.println("NetworkType:"+obj3.networktype());
				System.out.println("Revolution:"+obj3.revloution());
				obj3.chipModel();
				obj3.power();
				System.out.println("Version:"+obje3.version1+"  Version number:"+obje3.versionnumber);
				System.out.println("Total price of the set:"+obj3.price(128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise==4) {
				/*
				 * display the samsungsse features
				 */
				samasungse obj4=new samasungse();
				version obje4=version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("User Phone Number:"+obj4.getphonenumber());
				System.out.println("Storage:"+obj4.storage());
				System.out.println("Ram size:"+obj4.ram());
				System.out.println("Camera set up:"+obj4.cameraSetUp());
				System.out.println("Notch:"+obj4.notch());
				System.out.println("Screen Display:"+obj4.Screendisplay());
				System.out.println("NetworkType:"+obj4.networktype());
				System.out.println("Revolution:"+obj4.revloution());
				obj4.chipModel();
				obj4.power();
				System.out.println("Version:"+obje4.version1+"  Version number:"+obje4.versionnumber);
				obje4.versionnumber=13;//here singleton class is used to change the past version to current version
				System.out.println("Total price of the set:"+obj4.price(128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise ==5) {
				process=false;
			}
			else {
				System.out.println("Choose valid option");
			}
			
		}
		
	
	
		
		
		
		}else {
			System.out.println("enter correct user name and password");
		}
	}
	}


