 class person {
	public String name ;
	public int age ;
	public String id ;
	public String location;
	
	person(String name , int age , String id , String location){
		this.name = name ;
		this.age = age ;
		this.id = id ;
		this.location =location ;
		}
		
public void displayinfo(){
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("ID : "+id) ;
			System.out.println("Location : "+location);	
		 
	}


}

 class teacher extends person{
	String profession ;
	
	teacher(String name , int age , String id , String location, String profession){

	super( name ,  age ,  id ,  location);
	this.profession=profession ;
	
	}
	public void displayinfo2(){
	
		super.displayinfo();
		System.out.println(profession);
	}		
	
}
class student extends teacher{
	String skill ;
	
	student(String name , int age , String id , String location, String profession,String skill){

	super( name ,  age ,  id ,  location,profession );
	this.skill=skill ;
	
	}
	public void displayinfo3(){
	
		super.displayinfo2();
		System.out.println(skill);
	}		
	
}


public class Run{
	public static void main(String args[]){

	teacher t1 = new teacher("Hasan",20,"232-15-386","Dhaka","Boss") ;
	

	
	student t2 = new student("Hasan",20,"232-15-386","Dhaka","Boss","C++") ;
	
	t1.displayinfo2();
	t2.displayinfo3();



}
}



	
	





