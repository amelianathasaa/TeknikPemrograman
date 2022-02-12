package constants;
/*
Program ini dibuat untuk melakukan perhitungan ukuran paper. 
Agar memudahkan perhitungan, maka digunakan sebuah konstanta yaitu CM_PER_INCH
*/
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-11
 */
public class Constants2 {
    //Deklarasi konstanta 
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args){
        //Deklarasi variabel panjang dan tinggi paper
        double paperWidth = 8.5;
        double paperHeight = 11; 
        //Perhitungan ukuran paper 
        System.out.println("Paper size in centimeters: " + 
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
