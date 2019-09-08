package abstrac.t.practice;

public class Test {
	public static void main(String[] args) {
//		Employee emp = new Employee(); //error because Employee is not a concrete class.
		Employee emp = new BasePayPlusCommissionEmployee();
		emp.print();
	}
}
