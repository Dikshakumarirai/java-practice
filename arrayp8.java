//find sub array and also find array of sublength.
import java.util.*;
public class arrayp8 {
    
    public static void printSub(int numbers[]){
        int lenght=0;
        
        for(int i=0; i<numbers.length; i++){
       

           
            for (int j=i; j<numbers.length; j++){
               
                for(int k =i; k<=j; k++){
                  

                    System.out.print(numbers[k]+ " ");
                   
                    } 

                
                lenght++;
            System.out.println();

            }
            System.out.println();
            
        }
        System.out.println("totallenght:"+ lenght);
    }
    

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSub(numbers);
    }
}
