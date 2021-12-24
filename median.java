import java.util.Arrays;

public class median extends Thread{
	public Stats stats = new Stats();
	String numbers;
	
	public median(String input) {
		numbers = input;
	}
	
	public void run() {
		double median;
		String[] nums = numbers.split(" ");
		int[] newNums = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			newNums[i] = Integer.valueOf(nums[i]);
		}
		
		Arrays.sort(newNums);

	     // get count of scores
	     int totalElements = newNums.length;
	     // check if total number of scores is even
	     if (totalElements % 2 == 0) {
	        int sumOfMiddleElements = newNums[totalElements / 2] +
	        						  newNums[totalElements / 2 - 1];
	        // calculate average of middle elements
	        median = ((double) sumOfMiddleElements) / 2;
	     } else {
	        // get the middle element
	        median = (double) newNums[newNums.length / 2];
	  }
		
		stats.median = median;
		yield();
	}
}
