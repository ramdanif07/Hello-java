public class SegitigaSamaKaki extends Segitiga {
    Double alas;

    public SegitigaSamaKaki (Double alas, Double sisi){
        super (alas, sisi, sisi);
        this.alas = alas;
    }

    public void hitungLuas(){
        luas = 0.5 * alas * sisi2;
    }
}
