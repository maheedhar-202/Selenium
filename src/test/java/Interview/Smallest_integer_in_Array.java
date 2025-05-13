package Interview;

public class Smallest_integer_in_Array {

	    // Method to find the maximum value in an array
	    public static int findMax(int[] nums) {
	       if(nums==null||nums.length==0) {
	    	   
	        return Integer.MIN_VALUE;
	    }
	       int max= nums[0];
	       for(int i=1;i<nums.length;i++) {
	    	   if(nums[i]>max) {
	    		   max=nums[i];
	    	   }
	       }
	       return max;
	    }

	    // Method to run all test cases
	    public static void runTests() {
	        assert findMax(new int[] { 1, 3, 5, 2, 4 }) == 5 : "Test case 1 failed";
	        assert findMax(new int[] { 10, 6, 8, 12 }) == 12 : "Test case 2 failed";
	        assert findMax(new int[] { 5, 5, 5, 5 }) == 5 : "Test case 3 failed";
	        assert findMax(new int[] {}) == Integer.MIN_VALUE : "Test case 4 failed";
	        assert findMax(new int[] { -5, -8, -3, -12, -7 }) == -3 : "Test case 5 failed";

	        System.out.println("All test cases passed!");
	    }

	    public static void main(String[] args) {
	        runTests();
	    }

}
