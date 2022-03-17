package com.project;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	 public void calculator() throws IOException
	 {
		 Scanner scan = new Scanner(System.in);			
		    System.out.println("Enter first number");
			double a = scan.nextInt();
			System.out.println("Enter second number");
			double b = scan.nextInt();
			System.out.println("enter the symbols");
			String operator=scan.next();
			double result;
      
		    switch (operator) {

		     
		      case "+":
		        result = a + b;
		        System.out.println(a + " + " + b + " = " + result);
		        break;

		     
		      case "-":
		        result = a - b;
		        System.out.println(a + " - " + b + " = " + result);
		        break;

		     
		      case "*":
		        result = a * b;
		        System.out.println(a + " * " + b + " = " + result);
		        break;

		      
		      case "/":
		        result = a / b;
		        System.out.println(a + " / " + b + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        return;
		    }
		    System.out.println(result);
		   

				File file=new File("M:\\Sairam\\Output1.txt");
				
				if(file.createNewFile())
				{
					System.out.println("File is created");
				}
				else
				{
					System.out.println("File is already Exist");
				}
				//write data and append file
				FileWriter writer= new FileWriter(file);
				writer.append("First Number = "+a+ "Operator is =" +operator+ " Second Number is= "+b+" result is= "+result);
				writer.close();
				
		 
	 }
	 public static void main(String[] args) throws IOException {
		 FileHandling f = new FileHandling();
		 f.calculator();
	}
		    
}
