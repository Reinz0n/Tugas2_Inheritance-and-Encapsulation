
package baloktabung;

public class Lingkaran extends Tabung implements MenghitungBidang { //subclass Tabung dengan implements MenghitungBidang

    // Keliling Lingkaran
    @Override
    public void perhitunganKeliling() { 
        System.out.println("Keliling Lingkaran      = " + gethasil(jari2, dua));
    }
        
    // Luas Lingkaran
    @Override
    public void perhitunganLuas() { 
        System.out.println("Luas Lingkaran          = " + gethasil(jari2));
    }
}
