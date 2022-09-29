package samsung;


/*
 * Ensculaption method is used to check the username and password
 */

	class user{

	    private String  name = "shabarish";
	    private int id = 19130;
	   
	    private String password="shetty101";


	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	   

	    public String getPass() {
	        return password;
	    }

	    public void setPass(String pass) {
	        this.password = pass;
	    }

	    public boolean checking(String name, String pass) {
			 if(name.equals(this.name) && pass.equals(this.password)){
		            System.out.print("ID : " );
		            System.out.println(id);
		            return true;
		        }
		        
		            System.out.println("Username or Password incorrect!!");
		            
		        return false;
		}

	}


	public class samsunguser {
	
	    void user(String name, String pass){
	       user object = new user();
	        object.checking(name,pass);
	    }
	}



	
