import java.util.Scanner;

public class average extends Thread{
	public Stats stats = new Stats();
	String numbers;
	
	public average(String input) {
		numbers = input;
	}
	
	public void run() {
		int total = 0;
		int average;
		String[] nums = numbers.split(" ");
		
		for(int i = 0; i < nums.length; i++) {
			total += Integer.valueOf(nums[i]);
		}
		
		average = total / nums.length;
		stats.average = average;
		yield();
	}
}
