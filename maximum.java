public class maximum extends Thread {
	
	String numbers;
	
	public maximum(String input) {
		numbers = input;
	}
	
	public void run() {
		int maximum = Integer.MIN_VALUE;
		String[] nums = numbers.split(" ");
		
		for(int i = 0; i < nums.length; i++) {
			if(Integer.valueOf(nums[i]) > maximum) {
				maximum = Integer.valueOf(nums[i]);
			}
		}
		Stats.maximum = maximum;
		
		yield();
	}
}
