import java.util.*;
public class arrayp1 {
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc= new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        System.out.println("Android :" + marks[0] );
        System.out.println("Datamining :" + marks[1]);
        System.out.println("webdevlopment :" + marks[2]);
        System.out.println("DCN:" + marks[3] );
        System.out.println("SE :" + marks[4]);
    }
    
}
