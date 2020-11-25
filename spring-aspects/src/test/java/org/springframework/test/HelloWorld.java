package org.springframework.test;

public class HelloWorld {

	public void sayHello () {
		System.out.println("Hello AspectJ 1");
	}

		public static void main (String args [] ) {
			HelloWorld h = new HelloWorld ();
			h.sayHello () ;
	}
}
