import java.util.Scanner;

public class Stats {
	static int average;
	static int maximum;
	static int minimum;
	static double median;
	static double standardDeviation;

  public static void main(String[] args) {
	  Scanner keyboard = new Scanner(System.in);
	  String input;
	  
	  System.out.print("Please input your string of numbers: ");
	  
	  input = keyboard.nextLine();
	  
	  average avg = new average(input);
	  maximum max = new maximum(input);
	  minimum min = new minimum(input);
	  median  med = new median(input);
	  standardDeviation dev = new standardDeviation(input);
	  
	  avg.start();
	  max.start();
	  min.start();
	  med.start();
	  dev.start();
	  
	  try {
		avg.join();
		max.join();
		min.join();
		med.join();
		dev.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  System.out.println("The average value is: " + average);
	  System.out.println("The minimum value is: " + minimum);
	  System.out.println("The maximum value is: " + maximum);
	  System.out.println("The median  value is: " + median);
	  System.out.println("The standard deviation is: " + standardDeviation);
  }
} 