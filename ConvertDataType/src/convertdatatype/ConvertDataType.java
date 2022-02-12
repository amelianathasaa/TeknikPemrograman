package ConvertDataType;
/*
Program ini dibuat agar dapat mengetahui bagaimana melakukan convert tipe data 
yang berukuran besar ke kecil
*/
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-02-12
 */
public class ConvertDataType {
 /**
 * Method ini digunakan untuk mengubah data dari tipe long ke integer ke short  
 * @param l parameter berisi angka yang akan di convert 
 * @return short akan mereturn variable i 
 */
    static short methodOne(long l){    
        int i = (int) l;
        return (short) i;
    }
    
    /*
    Pada awalnya angka pada variabel bertipe double akan diconvert ke tipe float. 
    Setelah itu angka tersebut akan masuk ke methodOne dan menghasilkan data bertipe short lalu di convert ke byte 
    */
    
    public static void main(String[] args){
        //deklarasi nilai awal 
        double d = 10.25;
        //Proses convert ke tipe data lain
        float f = (float) d;
        byte b = (byte) methodOne ((long) f);
        System.out.println(b);
    }
    
}
