
package baloktabung;

public class Tabung extends Main implements MenghitungRuang{    // superclass dari Lingkaran dan subclass dari Main
    int tinggi, jari2;                                          // implements MenghitungRuang
    int dua = 2;
    private double hasil;
    
    // Input Data
    public Tabung(){
        System.out.print("Input Jari-jari   : "); jari2 = sc.nextInt();
        System.out.print("Input Tinggi      : "); tinggi = sc.nextInt();
    }
    
    // Rumus Keliling Lingkaran
    double gethasil(int jari2, int dua){
        hasil = jari2 * dua * Math.PI;
        return hasil;
    }
    
    // Rumus Luas Lingkaran
    double gethasil(int jari2){
        hasil = jari2 * jari2 * Math.PI;
        return hasil;
    }
    
    // Rumus Luas Permukaan Tabung
    @Override
    public void perhitunganLuasPermukaan(){
        hasil = 2 * Math.PI * jari2 * (jari2 + tinggi);
        System.out.println("Luas Permukaan Tabung   = " + hasil);
    }
    
    // Rumus Volume Tabung
    @Override
    public void perhitunganVolume(){
        hasil = Math.PI * jari2 * jari2 * tinggi;
        System.out.println("Volume Tabung           = " + hasil);
    }
}
