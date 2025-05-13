package Infosys_HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ComplexityChecker {
	public static List<List<Integer>> createSubArrays(int k,List<Integer> complexity){
		List<List<Integer>> subarrays=new ArrayList<List<Integer>>();
		int n=complexity.size();
		for(int i=0;i<=n-k;i++){
			List<Integer> subarray= new ArrayList<>();
			for(int j=0;j<k;j++) {
				subarray.add((int) Math.pow(2, j)*complexity.get(i+j));
			}
			subarrays.add(subarray);
		}
		return subarrays;
		
	}
	public static boolean isNotDecreasing(List<Integer> arr) {
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i)>arr.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static int CountNotDecreasing(int k,List<Integer> complexity) {
	List<List<Integer>> subarrays= createSubArrays(k, complexity);
	int count=0;
	for(List<Integer> subarray:subarrays) {
		if(isNotDecreasing(subarray)) {
			count++;
		}
	}
	return count;
	}
	public static void main(String[] args) {
		int k=3;
		List<Integer> complixity=List.of(1,2,3,4,5);
		System.out.println(CountNotDecreasing(k, complixity));
	}

}
