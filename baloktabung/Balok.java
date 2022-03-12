
package baloktabung;

public class Balok extends Main implements MenghitungRuang{     // superclass dari PersegiPanjang dan subclass dari Main
    int panjang, lebar, tinggi;                                 // implements MenghitungRuang
    int dua = 2;
    private double hasil; // Encapsulation
    
    // Input Data
    public Balok(){
        System.out.print("Input Panjang : "); panjang = sc.nextInt();
        System.out.print("Input Lebar   : "); lebar = sc.nextInt();
        System.out.print("Input Tinggi  : "); tinggi = sc.nextInt();
    }
    
    // Rumus Keliling Persegi Panjang
    double gethasil(int panjang, int lebar, int dua){
        hasil = dua * (panjang + lebar);
        return hasil;
    }
    
    // Rumus Luas Persegi Panjang
    double gethasil(int panjang, int lebar){
        hasil = panjang * lebar;
        return hasil;
    }

    // Rumus Luas Permukaan Balok
    @Override
    public void perhitunganLuasPermukaan(){
        hasil = 2 * (panjang*lebar + lebar*tinggi + panjang*tinggi);
        System.out.println("Luas Permukaan Balok        = " + hasil);
    }
    
    // Rumus Volume Balok
    @Override
    public void perhitunganVolume(){
        hasil = panjang * lebar * tinggi;
        System.out.println("Volume Balok                = " + hasil);
    }
}
