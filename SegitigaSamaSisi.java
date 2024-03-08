public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi (Double sisi){
        super (sisi, sisi, sisi);
    }

    public void hitungLuas(){
        Double tinggi = Math.sqrt(3) / 2 * sisi1;
        luas = 0.5 * sisi1 * tinggi;
    }
}
