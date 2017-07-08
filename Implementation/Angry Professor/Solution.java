import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfTestCase = sc.nextInt();
        while(noOfTestCase-- >0 ){
            int count = 0;
            int noOfStudent = sc.nextInt();
            int noRequired = sc.nextInt();
            for(int i=0; i < noOfStudent; i++){
                int check = sc.nextInt();
                if(check > 0){
                    count ++;
                }
            }
            if((noOfStudent-count) < noRequired){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        
    }
}
