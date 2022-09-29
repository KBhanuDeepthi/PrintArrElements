
class SmallestArrElement {
	public static void main(String[] args) {
		int arr[]=new int[] {23,54,32,14,70};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Smallest number in the array :" +min);

	}

}
