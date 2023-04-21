
//linear search
import java.util.*;
public class arrayp3 {
    public static int linearSearch(int number[],int key){
        for(int i=0; i<=number.length; i++ ){
            if(number[i]==i){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10,12,14,16,18,20};
        int key= 18;
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.print("Not found");
        }else{
            System.out.print("key:"+  "found" );
        }
        System.out.println();
    }
}
