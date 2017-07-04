import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            int grade = sc.nextInt();
            System.out.println(roundGrade(grade));
        }
    }
    private static int roundGrade(int grade){
        if(grade >= 38 ){
            if(grade % 5 == 3) grade = grade + 2;
            if(grade % 5 == 4) grade = grade + 1;
        }
        return grade;
    }
    
}  
    
