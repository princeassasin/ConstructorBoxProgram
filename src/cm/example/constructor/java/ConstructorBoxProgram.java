package cm.example.constructor.java;

public class ConstructorBoxProgram {

	double width,height,depth;
	  public ConstructorBoxProgram() {

		 System.out.println("I am in the Default Constructor !!"); 
		 width = 10;
		 height = 15;
		 depth = 20;
		 }
	  public ConstructorBoxProgram(double val) {
		  
		  System.out.println("I am in the Userdifine1 Constructor !!"); 
		  width = height=depth=(val>0)?val:1;
		  //height = 15;
		  //depth = 20;
	  }
	  public ConstructorBoxProgram(double w, double h, double d) {
		  
		  System.out.println("I am in the userdefine2 Constructor !!"); 
		  width = (w > 0)?w:1;
		  height = (h > 0)?h:1;
		  depth = (d > 0)?d:1;
	  }
	
	public static void main(String[] args) {
		System.out.println("I am in the main Method :  \n");
		
		ConstructorBoxProgram box = new ConstructorBoxProgram();
		System.out.println("width : " + box.width);
		System.out.println("height : " + box.height);
		System.out.println("depth : " + box.depth);
		System.out.println("I am again in the Default Constructor !!! \n");
		ConstructorBoxProgram box1 = new ConstructorBoxProgram(10);
		System.out.println("width : " + box1.width);
		System.out.println("height : " + box1.height);
		System.out.println("depth : " + box1.depth);
		System.out.println("I am again in the Userdefine1 Constructor !!! \n");
		ConstructorBoxProgram box2 = new ConstructorBoxProgram(10,15, 20);
		System.out.println("width : " + box2.width);
		System.out.println("height : " + box2.height);
		System.out.println("depth : " + box2.depth);
		System.out.println("I am again in the Usaerdefine2 Constructor !!!");

	}

}
