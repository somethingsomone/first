package excel.ataskaitos.database;

import java.util.ArrayList;

public class GerasArrayListPavyzdys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     ArrayList<Actor> alist=new ArrayList<Actor>();  
	      
	//     Actor actor = new
	     
	     alist.add( new Actor(1,"1","2"));
	     alist.add( new Actor(1,"Mister","Ponas"));
	    // alist.add(new Actor(2,"2","3"));
	  //   alist.add(new Actor(3,"3","4"));
	   
	      //displaying elements
	      System.out.println(alist.get(1).toString());

	      System.out.println();
	      
	      
	}
	
public static class Actor{
		int id;
		String firstName;
		String lastName;
		
		Actor(int id, String firstName, String lastName){
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		   public String toString() {
		        return ("Actor id: "+this.getId()+ " actor firsName " + this.getFirstName() + " actor lastname "  + this.getLastName());
		        				
		   }
		
		
		
		
		
		
	}
	
	

}
