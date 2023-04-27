public class Butterflyy {
    public static void butter(int n){
        //for first half
        for(int i=1; i<=n; i++){
            //stars-i
            for(int j=1;j<=i; j++){
                System.out.print( "*");
                
            }
            //for blank spaces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();

        }


        //for second half means that mirror image
        for(int i=n; i>=1; i--){
        // star-i
        for(int j=1; j<=i; j++){
            System.out.print( "*");
        }
 //for blank spaces 2*(n-i)
  for(int j=1; j<=2*(n-i); j++){
    System.out.print(" ");
  }
  //for stars-i
  for(int j=1; j<=i; j++){
    System.out.print("*");
  }
  System.out.println();
        }

}
public static void main(String args[]){
      butter(5);
    }
    
}
