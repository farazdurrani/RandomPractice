package inheritance.practice;

public class ThrowException {
	private int num;

	public ThrowException() {
	}

	public ThrowException(int num) throws Exception{
		throw new IllegalArgumentException("Exception thrown for no reason");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("Num cannot be lower than 0");
		}
		this.num = num;
	}

	public void setNum2(int num) throws Exception {
		if (num < 0) {
			throw new IllegalArgumentException("Num cannot be lower than 0");
		}
		this.num = num;
	}

}
