public class PersegiPanjang extends BangunDatar {
    Double panjang;
    Double lebar;

    public PersegiPanjang (Double panjang, Double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas(){
        luas = panjang * lebar;
    }

    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}
