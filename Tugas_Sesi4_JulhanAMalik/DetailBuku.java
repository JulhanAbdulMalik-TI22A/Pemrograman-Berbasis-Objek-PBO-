/**
 *
 * @author julhan
 */
public class DetailBuku {
    public static void main(String[] args) {
        String nama_buku = "Dasar Pemrograman Berbasis Objek";
        String rilis_buku = "20 Maret 2024";
        int harga_buku = 100000;
        
        PembuatBuku bukuPub = new PembuatBuku(nama_buku, rilis_buku, "Julhan", "JuDul Production", harga_buku);       
        bukuPub.InfoBuku();
        
    }
}
