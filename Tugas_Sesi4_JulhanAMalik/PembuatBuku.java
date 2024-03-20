/**
 *
 * @author julhan
 */
public class PembuatBuku extends TokoBuku{
    protected String Pembuat;
    protected String Publisher;
    
    public PembuatBuku(String namaBuku, String rilisBuku ,String Pembuat, String Publisher, int hargaBuku){
        super(namaBuku, rilisBuku, hargaBuku);
        this.Pembuat = Pembuat;
        this.Publisher = Publisher;
    }
    
    @Override
    public void InfoBuku(){
        System.out.println("Detail Lengkap Buku : \n");
        System.out.println("Nama Buku     : " + super.namaBuku);
        System.out.println("Tanggal Rilis : " + super.rilisBuku);
        System.out.println("Pembuat       : " + this.Pembuat);
        System.out.println("Publisher     : " + this.Publisher);
        System.out.println("Harga Buku    : " + super.hargaBuku);
    }
}