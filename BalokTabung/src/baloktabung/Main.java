
package baloktabung;

import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in); // Untuk input data
    static int pilih;
    
    public static void main(String[] args){
        
//        Menu
        do{
            System.out.println("=============================");
            System.out.println("|         Menu Utama        |");
            System.out.println("=============================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

//            Pilihan Menu
            switch (pilih) {
                case 1: // Menu Balok
                    System.out.print("\n");
                    PersegiPanjang balok = new PersegiPanjang(); // Instasiasi
                    System.out.println("\n----------  HASIL  ----------");
                    balok.perhitunganKeliling();
                    balok.perhitunganLuas();
                    balok.perhitunganLuasPermukaan();
                    balok.perhitunganVolume();
                    System.out.println("\n");
                    break;
                    
                case 2: // Menu Tabung
                    System.out.print("\n");
                    Lingkaran tabung = new Lingkaran(); // Instasiasi
                    System.out.println("\n----------  HASIL  ----------");
                    tabung.perhitunganKeliling();
                    tabung.perhitunganLuas();
                    tabung.perhitunganLuasPermukaan();
                    tabung.perhitunganVolume();
                    System.out.println("\n");
                    break;
                    
                case 3: // Menu Keluar
                    System.exit(0);
                    
                default: // Jika opsi tidak tersedia
                    System.out.println("\nMaaf, opsi yang dipilih tidak tersedia. Silahkan pilih opsi yang tersedia\n");    
                    break;
            }
        }while(pilih != 3);
    }
    
}
