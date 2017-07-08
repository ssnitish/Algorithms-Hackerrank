import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr.length);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                System.out.println(arr.length - i);
            }
        }
    }
}
