package inheritance.practice3;

public class Test {
	public static void main(String[] args) {
		MyInterface[] mi = { new Invoice(), new MyEmployee() };
		for (MyInterface m : mi) {
			m.pay();
			if (m instanceof Employee) {
				Employee emp = (Employee) m;
				emp.employeePay();
			}
		}
	}

}
