package versionE;

public class InvalidITNumberException extends Exception{
	
	public InvalidITNumberException (String Message) {
	
	super(Message);
	}

}

 Public Class Student{
	 
	 String id;
	 String name;
	
	 Public Student(String id, String name) {
		 
		 super();
		 this.id =id;
		 this.name =name;
	 }
	 
	 void display() {
		 
		 try {
			 
			 if(id.length()!=10||(id.substring(0,2).equals("IT"))==false && (id.substring(0,2).equals("it"))==false) {
				 throw new InvalidITNumberException("Inavalid number");
			 }try {
				 long num = Integer.parseInt(id.substring(2, 10));
			 }catch(NumberFormatException e) {
				 throw new InvalidITNumberException("Invalid it number");
			 }
			 
			 System.out.println(id);
			 System.out.println(name);
		 
			 
			  }
		 catch(InvalidITNumberException e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public static void main(String[] args) throws InvalidITNumberException{
		 Student s = new Student("IT2134567","H");
		 s.display();
	 }
	 
	 
 }
