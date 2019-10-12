package thi.s.packag.e.should.not.be.able.to.access.packag.e.level.clas.s;

//Importing a package-access class is illegal.
import a.clas.s.that.has.packag.e.level.access.ShouldNotBeAvailableOutsidePackage;


public class Test {
	public static void main(String[] args) {
		//Creating a package-access object is illegal.
		ShouldNotBeAvailableOutsidePackage object = new ShouldNotBeAvailableOutsidePackage();
	}
}
