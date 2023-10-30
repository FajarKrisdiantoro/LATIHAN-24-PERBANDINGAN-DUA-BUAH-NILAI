/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbogit24;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT24 {

    /**
     * @param args the command line arguments
     */
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
