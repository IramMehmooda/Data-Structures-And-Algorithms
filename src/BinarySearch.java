
public class BinarySearch {
	
	int binarySearch(int arr[],int left,int right,int num) {
		int r=0;
		if(left<=right) {
			int mid=left+((right-left)/2);
			if(num==arr[mid]) {
				
				r= num;
				
			}
			else if(num<arr[mid]) {
				binarySearch(arr, left, mid-1, num);
			}
			else {
				binarySearch(arr, mid+1, right, num);
			}
		}
		else {
			r=-1;
		}
		return r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {12,14,16,19,20,26};
		int length=ar.length;
		
		BinarySearch b=new BinarySearch();
		int result=b.binarySearch(ar, 0,length,12);
		if(result==-1) 
			System.out.println("element not found");
		else
			System.out.println("element found");

	}

}
