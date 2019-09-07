package inheritance.practice;

public class Vehicle {
	private int tyres;

	protected String color;

	public Vehicle() {
		System.out.println("From Vehicle ");
		tyres = 4;
		color = "White";
	}

	public Vehicle(int tyres, String color) {
		this.tyres = tyres;
		this.color = color;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [tyres=" + tyres + ", color=" + color + "]";
	}
}
