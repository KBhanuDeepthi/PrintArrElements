
class SortOfArrElements {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,5,6,4};
		int temp=0;
		System.out.println("Array elements before sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		System.out.println();
		System.out.println("Array elements after sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " +arr[i]);
		}

		

	}

}
