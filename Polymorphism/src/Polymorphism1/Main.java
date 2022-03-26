package Polymorphism1;
//Compile time polymorphism is achieved by function overloading
//Function overloading works by calling different functions having the same name, 
//but the different number of arguments passed to it.
public class Main {
	public static void main(String[] args) {
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}