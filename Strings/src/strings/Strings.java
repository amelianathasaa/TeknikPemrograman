package strings;
import java.io.*;
import java.util.*;

/*
This program is a exercise to understanding of Java String 

Given two strings of lowercase English letters A and B, following operations : 
1. Sum the lengths of A and B 
2. Determine if A is lexicography larger than B 
3. Capitalize the first letter is A and B and print on a single line, separated
   by a space. 

Input Format : 
The first line contains a string A. The second line contains another string B. 
The strings comprised of only lowercase English letters. 

Output Format : 
There are three lines of output : 
1. Sum of the lengths of A and B
2. Write "yes" if A is lexicographically greater than B otherwise print No instead 
3. Capitalize the first letter in both A and B print them on a single line,
separated by a space 
*/

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-12
 */

public class Strings {

    public static void main(String[] args) {
        
        Scanner masukan =new Scanner(System.in);
        //Input kata pada variable A dan B 
        String A = masukan.next();
        String B = masukan.next();
        
        //Menampilkan jumlah huruf dari kedua string dari variabel A dan B 
        System.out.println(A.length() + B.length());
        
        //Melakukan perbandingan 
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        //Program agar huruf awal setiap kata menjadi huruf kapital
        A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
        B = (B.substring(0,1)).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
