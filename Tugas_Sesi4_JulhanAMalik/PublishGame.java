/**
 *
 * @author julhan
 */
public class PublishGame {
    protected String namaGame;
    protected String genreGame;
    protected String rilisGame;
    protected int hargaGame;
    
    public PublishGame(String namaGame, String genreGame, String rilisGame, int hargaGame){
        this.rilisGame = rilisGame;
        this.namaGame = namaGame;
        this.genreGame = genreGame;
        this.hargaGame = hargaGame;
    }
    
    public void InfoGame(){
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Genre Game    : " + genreGame);
        System.out.println("Tanggal Rilis : " + rilisGame);
        System.out.println("Harga Game    : " + hargaGame);
    }
}

