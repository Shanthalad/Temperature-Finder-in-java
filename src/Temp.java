import java.util.*;
import java.io.*;
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double Temperature;
		System.out.println("Enter a value of temperature:");
		Temperature=input.nextDouble();
		Temperature=(Temperature*9/6.0)+32;
		System.out.println("Temperature in Fahrenheit="+ Temperature);
		
		

	}

}
