package datatypes;
//Import dilakukan agar dapat melakukan proses input dan output 
import java.util.*; 
import java.io.*; 
/**
 * Given an input integer, you must determine which primitive data types 
 * are capable of properly storing that input 
 * 
 * Input Format :
 * The first line contains an integer, T, denoting the number of test cases.
 * Each test case, T, is comprised of a single line with an integer, n
 * which can be arbitrarily large or small. 
 * 
 * Output Format :
 * For each input variable n and appropriate primitive datatype, you must 
 * determine if the given primitives are capable of storing it. 
 * If yes, then print : 
 * N can be fitted in : 
 * * datatype 
 * 
 * 
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-01-11
 */

class DataTypes{
    public static void main(String []argh)
    {
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        //Perintah untuk memasukkan bilangan yang merupakan jumlah banyaknya data yang akan dimasukkan (t)
        int t = masukan.nextInt(); //nextInt digunakan untuk tipe integer 

        //Perulangan digunakan untuk proses input bilangan sebanyak t 
        for(int i=0; i<t ;i++)
        {
            try  //Untuk mencoba menjalankan block program mengenai dimana munculnya error yang ingin diproses
            {
                //Perintah untuk input bilangan  
                long N = masukan.nextLong();
                System.out.println(N+" can be fitted in: ");
                
                //Untuk memeriksa apakah bilangan yang diinputkan termasuk pada tipe data byte 
                if(N >= -128 && N <= 127){
                    System.out.println("* byte");
                }
                
                //Untuk memeriksa apakah angka yang diinputkan termasuk pada tipe data short 
                if(N >= Short.MIN_VALUE && N <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                
                //Untuk memeriksa apakah angka yang diinputkan termasuk pada tipe data integer 
                if(N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                
                //Untuk memeriksa apakah angka yang diinputkan temasuk pada tipe data long
                if(N >= Long.MIN_VALUE && N <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            
            //Catch merupakan pasangan try. Untuk menangkap kesalahan atau bug yang terjadi dalam block try
            catch(Exception e)
            {
                //Jika inputan tidak termasuk pada syarat pada blok try, maka outputnya akan : 
                System.out.println(masukan.next()+" can't be fitted anywhere.");  
            }

        }
    }
}