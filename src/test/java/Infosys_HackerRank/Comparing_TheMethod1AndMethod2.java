package Infosys_HackerRank;

public class Comparing_TheMethod1AndMethod2 {
	public static double BarCalculation(String bar) {
		int filledCount=0;
		int totalCount=bar.length();
		for(char c:bar.toCharArray()) {
			if(c=='|') {
				filledCount++;
			}
		}
		return (double)filledCount/totalCount*100;
	}
	public static void compareValues(double calculatedPercentage, double valueToCompare) {
		if(calculatedPercentage==valueToCompare) {
			System.out.println("Values Are Equal");
		}else if(calculatedPercentage>valueToCompare) {
			System.out.println("Calculated Value Is Grater Than ValueTo Compare");
		}else {
			System.out.println("Calcuatled Percentage Value Is Less Than Value To Compare");
		}
	}
	
	public static void main(String[] args) {
		String bar="||| |||";
		double calculatedValue=BarCalculation(bar);
		System.out.println("Calculated Bar Percentage "+calculatedValue);
		double value=50.0;
		compareValues(calculatedValue, value);
	}

}
