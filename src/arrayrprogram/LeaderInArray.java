package arrayrprogram;
 

public class LeaderInArray {
	
	public static void main(String args[]) {
		
		int arr[]= {16,17,4,3,5,2};
		
		
		for(int i=0;i<arr.length;i++) {
			
			int key=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(key>arr[j]) {
					if(j==arr.length-1) {
					System.out.println("Leader in Array: "+arr[i]);
					}
				}else {
					break;
				}
			}
		}
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		
	 new Thread(()->{
		 
	 });
		
	}
	
	

}
