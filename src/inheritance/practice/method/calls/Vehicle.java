package inheritance.practice.method.calls;

public class Vehicle {

	private String name;

	private int tyres;

	public Vehicle() {
	}

	public Vehicle(String name, int tyres) {
		this.name = name;
		this.tyres = tyres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", tyres=" + tyres + "]";
	}

}
