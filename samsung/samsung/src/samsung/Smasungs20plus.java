package samsung;

/*
 * here multi level ihnertiace is used samsungs20plus extends samsung20 class
 */
class Smasungs20plus extends Samsungs20{
	

/*
 * Samsungs20 extends features class ,to get feature of the mobile and implements the phone and features act as a inhertiance and interface
 */
    private String userName = "samsudeen";
    private String phonenumber="9361451152";

    public String getUserName() {
        return userName;
    }

    public int ram(){
        return 12;
    }
    
    

    @Override
    public String cameraSetUp(){
        return "Double Camera SetUp";
    }
    @Override
    public String revloution() {
    	return "4k/2k/1080hd with 960ps";
    }
    
    @Override
	public String Screendisplay() {
		return "7.1inch";
	}

    String cameraSetUp(int a){
        return super.cameraSetUp();
    }
    static Smasungs20plus p=new Smasungs20plus();
    /*
     * by default we can add ram by user.
     */
   // public static int price(int ram,int storage,int procesosor) {
    //	return (ram+storage+procesosor)*4;
    //}
    
    /*
     * or here ram value set by the defult
     */
    public static int price(int storage,int procesosor) {
    	return (p.ram()+storage+procesosor)*4;
    }
    
    void chipModel() {
	   super.chipModel();
   }
    
    @Override
	void power() {
		// TODO Auto-generated method stub
		System.out.println("5000mah battery");
		
	}

}

