/*Assignment 4.1*/

package session4;

class Parent {

	private void method1() { // private method
		System.out.println("Parent's method1()");
	}

	public void method2() { // Public method.
		System.out.println("Parent's method2()");
		method1();
	}
}

public class Session4_1 extends Parent {
	public void method1() {
		System.out.println("Child's method1()");
	}

	public static void main(String args[]) {
		Parent p = new Session4_1(); // object of the child class can access the
										// public members of the parent class.

		p.method2(); // object will first access public method of parent class
						// first it will print the line then it will call
						// method1()
						// from the parents method1 it will print Parent's
						// method1()
	}
}

// Output is answer C :
// Parent's Method2()
// Parent's Method1()