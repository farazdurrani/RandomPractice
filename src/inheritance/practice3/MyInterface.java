package inheritance.practice3;

public interface MyInterface {
	public abstract void pay();// Even though method declarations in interfaces are implicitly public and abstract, it
								// is good practice to specificallty mention them since Java 8 added default method
								// implementations and Java 9 added private methods.
}
