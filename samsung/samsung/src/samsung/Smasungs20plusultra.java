package samsung;


/*
 * here hierchical inheritance is used were samsungs20plus is exttended by both samsungse and sasmusngs20plusultra
 */
class Smasungs20plusultra extends Smasungs20plus{

    private String userName = "shabarish";
    private String phonenumber="9361451152";

    @Override
    public String getUserName() {
        return userName;
    }

   

   void chipModel() {
	   super.chipModel();
   }
   
   public static int price(int ram,int storage,int procesosor) {
    	return (ram+storage+procesosor)*8;
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