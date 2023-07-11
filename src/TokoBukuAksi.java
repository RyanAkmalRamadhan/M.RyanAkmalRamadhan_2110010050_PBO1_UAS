import java.sql.SQLOutput;

public class TokoBukuAksi {
    public static void main(String[] args) {
        TokoBuku A = new TokoBuku();
        A.nama = "Buku Pemrograman";
        A.harga = 50000;
        A.penulis = "Ahmad";

        TokoBuku B = new TokoBuku();
        B.nama = "Buku Java";
        B.harga = 65000;
        B.penulis = "Budi";

        System.out.println("===============TOKO BUKU MERDEKA===============");
        System.out.println("Buku yang sedang promo mendapatkan potongan 10K");
        System.out.println("1.Nama Buku   : "+A.nama);
        System.out.println("  Harga Buku  : "+A.harga);




    }
}
