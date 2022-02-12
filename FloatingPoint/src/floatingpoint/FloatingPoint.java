package floatingpoint;
/*
Program ini dibuat agar dapat mengetahui bagaimana menggunakan method matematika yaitu Math.round()
Math.round() berfungsi untuk  membulatkan bilangan ke bilangan terdekat dengan bilangan aslinya. 
*/
/**
* @author Amelia Nathasa
* @version 1.0
* @since 2022-02-12
*/

public class FloatingPoint {
 /**
 * @param args Unused.
 */
    public static void main(String[] args) {
        //Deklarasi variabel 
        double x = 92.98;
        //Proses pembulatan bilangan menggunakan math.round()
        int nx = (int) Math.round(x); 
        //Untuk melihat hasilnya, tambahkan sintaks print : 
        System.out.println(nx);
    }
    
}
