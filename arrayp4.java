
//leaner search program
import java.util.*;
public class arrayp4 {
  public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==i){
                return i;

            }
            
        }
        return -1;

    }
    


    public static void main(String arg[]){
        int number[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int key =15;
        int index=linearSearch(number, key);
        if(index==-1)
        {
            System.out.println("Not found:" );
        }
        else{
            System.out.println("found");

        }


    }
}
