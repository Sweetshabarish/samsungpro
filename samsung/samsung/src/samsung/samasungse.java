package samsung;

/*
 * here hierchical inheritance is used were samsungs20plus is exttended by both samsungse and sasmusngs20plusultra
 */
class samasungse extends Smasungs20plus{
	
	/*
	 * user name + phone number ,created because to ask about the phone stuas
	 */
	private String userName = "abinaya";
	private String phonenumber="9361451152";

    @Override
    public String getUserName() {
        return userName;
    }

    public int ram(){
        return 12;
    }
//method overriding
   void chipModel() {
	   super.chipModel();
   }
   //method overloading
   public static int price(int ram,int storage,int procesosor) {
    	return (ram+storage+procesosor)*6;
    }

    public String cameraSetUp(){
        return super.cameraSetUp(5);
    }

    public String notch(){
        return "squaree notch";
    }
    
    @Override
	void power() {
		// TODO Auto-generated method stub
		System.out.println("6000mah battery");
		
	}
    void chipModel1() {
		   super.chipModel();
	   }
	
}