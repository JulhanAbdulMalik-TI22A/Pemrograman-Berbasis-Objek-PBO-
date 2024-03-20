/**
 *
 * @author julhan
 */
public class TokoBuku {
    protected String namaBuku;
    protected String rilisBuku;
    protected int hargaBuku;
    
    public TokoBuku(String namaBuku, String rilisBuku, int hargaBuku){
        this.namaBuku = namaBuku;
        this.rilisBuku = rilisBuku;
        this.hargaBuku = hargaBuku;
    }
    
    public void InfoBuku(){
        System.out.println("Nama Buku     : " + namaBuku);
        System.out.println("Tanggal Rilis : " + rilisBuku);
        System.out.println("Harga Buku    : " + hargaBuku);
    }
}

