package practice;
	public class Constructor
	{
	String name; //Instance Variable
	int age;
	String gender;

	public Constructor (String name,int age, String gender)
	{
	    this.name = name;
	    this.age= age;
	    this.gender = gender;
	}
	public void Print(){
		//String name="nitz";//local variable
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(gender);
	}

	    public static void main(String[] args) {
	    	Constructor obj = new Constructor("Nitesh" , 22,"Male");
	    	Constructor obj1 = new Constructor("Abhishek" , 28 , "Male");
	obj.Print();
	obj1.Print();
	    }
	}
