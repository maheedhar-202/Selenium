package Collection_FrameWork;

public class ArrayAVG {
	public static void main(String[] args) {
		int num[]=new int[3];
		num[0]=9;
		num[1]=10;
		num[2]=11;

		int Sum=0;
		for(int i=0;i<num.length;i++) {
            Sum=Sum+num[i];
		}
		System.out.println(Sum/4);
	}
}
