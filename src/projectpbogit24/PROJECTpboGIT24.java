/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/
package projectpbogit24;
import java.util.Scanner;

public class PROJECTpboGIT24 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban;
        do{
        System.out.println("====Program Perbandingan Nilai====");
        System.out.print("Masukan Nilai Pertama: ");
        int NilaiPertama = input.nextInt();
        System.out.print("Masukan Nilai Kedua: ");
        int NilaiKedua = input.nextInt();
        
        // Membandingkan dua nilai dan menampilkan hasilnya
        if (NilaiPertama > NilaiKedua) {
            System.out.println("Hasil: " + NilaiPertama + " lebih besar dari " + NilaiKedua + "");
        } else if (NilaiPertama < NilaiKedua) {
            System.out.println("Hasil: " + NilaiKedua + " lebih besar dari  " + NilaiPertama + "");
        } else {
            System.out.println("Hasil: " + NilaiPertama + "Sama Dengan "+NilaiKedua+"");
        }
        
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak): ");
            jawaban = input.next();
        } while (jawaban.equalsIgnoreCase("Ya"));
        
        
    }
    
}
