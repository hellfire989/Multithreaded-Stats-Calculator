public class standardDeviation extends Thread{
	public Stats stats = new Stats();
	String numbers;
	
	public standardDeviation(String input) {
		numbers = input;
	}
	
	public void run() {
		double standardDev;
		String[] nums = numbers.split(" ");
		double[] newNums = new double[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			newNums[i] = Integer.valueOf(nums[i]);
		}
		
		double sum = 0.0, standardDeviation = 0.0;
        int length = nums.length;

        for(double num : newNums) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: newNums) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        standardDev = Math.sqrt(standardDeviation/length);
        stats.standardDeviation = standardDev;
	}
}
