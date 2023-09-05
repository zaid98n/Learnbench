package javapg;

public class Pyramid {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
            
            for(int k=5-i;k>=1;k--){
                
                System.out.print(" ");
            }    
            for(int j=1; j<=i; j++){
    
            	System.out.print("* ");
            }
    	System.out.println("");
        }
		
//====================================================================================	
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

//====================================================================================
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");
		
		for(int k=1; k<=5; k++) {
			
			for(int l=5; l>=k; l--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
//====================================================================================
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");
		
		for(int m=1; m<=5; m++){
			
			for(int o=1; o<=m-1; o++) {
				System.out.print(" ");
			}
			for(int n=5; n>=m; n--){
			    
            	System.out.print("* ");
            }
			System.out.println("");
        }
		
//====================================================================================
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");		
		
		for(int i=1; i<=5; i++){
            
            for(int k=5-i;k>=1;k--){
                
                System.out.print("  ");
            }    
            for(int j=1; j<=i; j++){
    
            	System.out.print(" *");
            }
    	System.out.println("");
        }
		
//====================================================================================
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");	
		
		for(int m=1; m<=5; m++){
			
			for(int o=1; o<=m-1; o++) {
				System.out.print("  ");
			}
			for(int n=5; n>=m; n--){
			    
            	System.out.print(" *");
            }
			System.out.println("");
        }
	}
}
