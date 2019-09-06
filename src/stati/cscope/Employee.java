package stati.cscope;

/**
 * @author 
 * 
 * About Static thing:
 * static variables and methods can be called in **any** method (constructor, instance methods, static methods)
 * but instance variables cannot be called in static methods.
 *
 */
public class Employee {
	
	private static int count = 0;
	
	public static int count2 = 0;
	
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	public static int getCount() {
//		System.out.println(name);
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	public String getName() {
		System.out.println(count);
		System.out.println(getCount());
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
