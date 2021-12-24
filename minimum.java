public class minimum extends Thread {
	
	String numbers;
	
	public minimum(String input) {
		numbers = input;
	}
	
	public void run() {
		int minimum = Integer.MAX_VALUE;
		String[] nums = numbers.split(" ");
		
		for(int i = 0; i < nums.length; i++) {
			if(Integer.valueOf(nums[i]) < minimum) {
				minimum = Integer.valueOf(nums[i]);
			}
		}
		Stats.minimum = minimum;
		
		yield();
	}
}
