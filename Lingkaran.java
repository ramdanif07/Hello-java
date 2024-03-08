public class Lingkaran extends BangunDatar {
    Double jariJari;

    public Lingkaran (Double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    
    public void hitungLuas () {
        luas = Math.PI * jariJari * jariJari;
    }

    public void hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
    }
}
