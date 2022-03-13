
package baloktabung;

public class PersegiPanjang extends Balok implements MenghitungBidang{ //subclass Balok dengan implements MenghitungBidang

    // Keliling Persegi Panjang
    @Override
    public void perhitunganKeliling() {
        System.out.println("Keliling Persegi Panjang    = " + gethasil(panjang, lebar, dua));
    }
       
    // Luas Persegi Panjang
    @Override
    public void perhitunganLuas() {
        System.out.println("Luas Persegi Panjang        = " + gethasil(panjang, lebar));
    }
}
