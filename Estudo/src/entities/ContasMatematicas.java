package entities;

public class ContasMatematicas {

	public ContasMatematicas() {
	}

	public static int mdc(int x, int y) {
		int mdc=0;
		int maior;
		if (x > y) maior = x;
		else maior = y;
		for(int i = 1; i <= maior; i++) {
			if(x%i==0 && y%i==0){
				mdc = i;		
			}
		}		
		return mdc;
	}
	
	public static int maior(int x, int y) {
		if (x > y) 
			return x;
		else 
			return y;
	}
	
	public static int fatorial(int x) {
		if (x <= 1) 
			return 1; 
		else 
			return x*fatorial(x-1);				
	}
	

}
