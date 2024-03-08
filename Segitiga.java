public class Segitiga extends BangunDatar {
    Double sisi1;
    Double sisi2;
    Double sisi3;

    public Segitiga (Double sisi1, Double sisi2, Double sisi3) {
        super("Segitiga");
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public void hitungLuas() {

    }

    public void hitungKeliling() {
        keliling = sisi1 + sisi2 + sisi3;
    }
}
