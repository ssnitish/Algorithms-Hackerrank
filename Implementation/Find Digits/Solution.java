import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            int digit = sc.nextInt();
            String stringDigit = Integer.toString(digit);
            int digLength = stringDigit.length();
            int arr[] = new int[digLength];
            int count = 0;
            
            for(int i=0; i < digLength; i++){
                arr[i] = Integer.parseInt(stringDigit.substring(i,i+1)); 
                
                if((arr[i] != 0) && (digit%arr[i]==0) ){
                    count++;
                }
            }
            System.out.println(count);
        }

        
    }
}
