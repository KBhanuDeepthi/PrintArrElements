import java.util.Arrays;

class SecondLargestArrElement {
	static int getSecondLargest(int[]a,int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) {
		int a[]= {1,2,4,6,5};
		System.out.println("second largest:" +getSecondLargest(a,5));
		

	}

}
