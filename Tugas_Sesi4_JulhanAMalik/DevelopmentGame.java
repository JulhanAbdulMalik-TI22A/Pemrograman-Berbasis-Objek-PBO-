/**
 *
 * @author julhan
 */
public class DevelopmentGame extends PublishGame{
    protected String Developer;
    protected String Publisher;
    
    public DevelopmentGame(String namaGame, String genreGame, String rilisGame ,String Developer, String Publisher, int hargaGame){
        super(namaGame, genreGame, rilisGame, hargaGame);
        this.Developer = Developer;
        this.Publisher = Publisher;
    }
    
    @Override
    public void InfoGame(){
        System.out.println("Detail Lengkap Game : \n");
        System.out.println("Nama          : " + super.namaGame);
        System.out.println("Genre         : " + super.genreGame);
        System.out.println("Tanggal Rilis : " + super.rilisGame);
        System.out.println("Developer     : " + this.Developer);
        System.out.println("Publisher     : " + this.Publisher);
        System.out.println("Harga Game    : " + super.hargaGame);
    }
}