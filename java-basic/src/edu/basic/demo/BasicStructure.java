/* package name 
 * prefix always written in lower case
 * domain names like com, edu, gov, mil, net, org
 * always it should be first line*/
package edu.basic.demo;

public class BasicStructure {
/* 
 * class name mixed with the first letter of each internal word capitalized
  */
	
	//main method called by JVM
	public static void main(String[] args) {
		System.out.println("Basic Structure of java");
		
		// variable declaration must start with $ or _ or letters
		String $name="abc";
		String _class="10th";
		double percentage=80.32;
		final int SCORE=100;
		
		System.out.println("name\t"+ $name);
		System.out.println("class\t"+ _class);
		System.out.println("percentage"+ percentage);
		System.out.println("score"+ SCORE);
	}
	
	//method declaration
	public void displayDetails() {
		int i=10; //temporary variable can be one character
		System.out.println("value of i\t"+ i);
	}
	
}
