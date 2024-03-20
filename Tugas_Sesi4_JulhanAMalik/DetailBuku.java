/**
 *
 * @author julhan
 */
public class DetailBuku {
    static int discount(int harga_buku, int diskon){
        return harga_buku;
    }
    
    static double discount(double harga_buku, double diskon){
        diskon = diskon * harga_buku;
        return harga_buku - diskon;
    }
    
    public static void main(String[] args) {
        String nama_buku = "Dasar Pemrograman Berbasis Objek";
        String rilis_buku = "20 Maret 2024";
        int harga_buku = 100000;
        double diskon_buku = discount(harga_buku, 0.4);
        
        PembuatBuku bukuPub = new PembuatBuku(nama_buku, rilis_buku, "Julhan", "JuDul", harga_buku);       
        bukuPub.InfoBuku();
        
        System.out.println("Harga Diskon  : " + diskon_buku);
    }
}
