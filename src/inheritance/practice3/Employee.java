package inheritance.practice3;

public abstract class Employee implements MyInterface {

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract void employeePay();

	@Override
	public void pay() {
		employeePay();
	}

}
