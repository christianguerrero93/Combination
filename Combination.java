
public class Combination {

	public static int choosingFromSet(int n, int k){
		if(k==n){
			return 1; //only 1 combo possible ...all or nothing
		}else if( k==0){
			return 1;  //only 1 combo possible ...all or nothing
		}
		else if(k>n){
			return 0;
		}
		else{
			return choosingFromSet(n-1, k-1) + choosingFromSet(n-1, k);
		}
		
	}
}
