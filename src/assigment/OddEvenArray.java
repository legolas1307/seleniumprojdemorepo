package assigment;

public class OddEvenArray {

	public static void main(String[] args) {

		int[] ar = {1,2,3,4,5,6,7};
		int odd = 0, even = 0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even count: "+ even + "\nOdd count: " + odd);

	}

}
