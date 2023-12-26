/**
 * 
 */

/**
 * @author PaulA
 *
 */
public class Name {

	/**
	 * @param args
	 */
	private String my_name;
	private int age;
	public Name() // Example of a no - argument constructor
	
	{
		System.out.println("Constructor method used");
		my_name = "Daytona State College at ATC campus";
	}
	
	public Name(String my_name)
	{
		this.my_name = my_name;
	}
	
	public Name(String my_name, int age)
	{
		this.my_name = my_name;
		this.age = age;
	}
	
	public Name(int age, String my_name )
	{
		this.my_name = my_name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name college_campus1 = new Name(); // instantiated by object follows signature in line 16
		
		System.out.println("College name is :" + college_campus1.my_name);
		
		Name college_campus2 = new Name ("University  of Central Florida"); // instantiated by object follows signature in line 23
		System.out.println("College name is :" + college_campus2.my_name);
		
		Name college_campus3 = new Name ("Stetson University", 100); // instantiated by object follows signature in line 23
		System.out.println("College name is :" + college_campus3.my_name);
		System.out.println("College name is :" + college_campus3.age);
		
		Name college_campus4 = new Name ( 120, "Embry Riddle University"); // instantiated by object follows signature in line 23
		System.out.println("College name is :" + college_campus4.my_name);
		System.out.println("College name is :" + college_campus4.age);
		
		
	}

}
