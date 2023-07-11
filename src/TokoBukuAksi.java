import java.sql.SQLOutput;

public class TokoBukuAksi {
    public static void main(String[] args) {
        TokoBuku A = new TokoBuku();
        A.nama = "Buku Pemrograman";
        A.harga = 50000;
        A.penulis = "Ahmad";

        System.out.println("===============TOKO BUKU MERDEKA===============");
        System.out.println("Buku yang sedang promo mendapatkan potongan 10K");
        System.out.println("===============================================");
        System.out.println("1.Nama Buku    : "+A.nama);
        System.out.println("  Harga Buku   : Rp."+A.harga);
        System.out.println("  Penulis Buku : "+A.penulis);


        TokoBuku B = new TokoBuku();
        B.nama = "Buku Java";
        B.harga = 65000;
        B.penulis = "Budi";

        System.out.println("2.Nama Buku    : "+B.nama);
        System.out.println("  Harga Buku   : Rp."+B.harga);
        System.out.println("  Penulis Buku : "+B.penulis);
        
        B.mendapatDiskon();
        System.out.println("  Harga Buku Setelah Mendapat Diskon  : "+(A.harga+B.harga));




    }
}
