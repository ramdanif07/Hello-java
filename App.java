public class App {
    public static void main(String[] args) throws Exception {
        //membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(10.0, 5.0);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling);
        System.out.println("=========================================");

        //membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(5.0);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        System.out.println("Luas Lingkaran: " + lingkaran.luas);
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling);
        System.out.println("=========================================");

        //membuat objek SegitigaSamaKaki
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(4.0,6.0);
        segitigaSamaKaki.hitungLuas();
        segitigaSamaKaki.hitungKeliling();
        System.out.println("Luas Segitiga Sama Kaki: " + segitigaSamaKaki.luas);
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.keliling);
        System.out.println("=========================================");

        //membuat objek SegitigaSamaSisi
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(4.0);
        segitigaSamaSisi.hitungLuas();
        segitigaSamaSisi.hitungKeliling();
        System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.luas);
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.keliling);
        System.out.println("=========================================");

        //membuat objek SegitigaSembarang
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(3.0, 4.0, 5.0);
        segitigaSembarang.hitungLuas();
        segitigaSembarang.hitungKeliling();
        System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.luas);
        System.out.println("Keliling Segitiga Sembarang: " + segitigaSembarang.keliling);
    }
}
