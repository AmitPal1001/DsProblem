package arrayrprogram;

public class NumberOfOccurrence {
	
	public static  void main(String args[]) {
		
		int arr[]= {2,3,5,1,3,5,10,1,3,1,15,10};
		int valArr[]=new int[arr.length];
		int countArr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
			
				if(arr[j]==key) {
					countArr[i]=++count;
					valArr[i]=key;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Occurence of Character: "+valArr[i]+"---------"+countArr[i]);
		}
		
	}

}
