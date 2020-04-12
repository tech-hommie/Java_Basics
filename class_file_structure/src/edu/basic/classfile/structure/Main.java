package edu.basic.classfile.structure;

/*
 * There are three classes Main, Demo1, Demo2
 * At the time of compilation it will create separate three class file 
 * such as Main.class, Demo1.class and Demo2.class
 * JVM looks for main method which is in Main class
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("class file compiling");
	}
}

//demo1 dummy class
class Demo1{
	
}
//demo2 dummy class
class Demo2{
	
}

/*
 * Output:
 * class file compiling
 * 
 */
  
