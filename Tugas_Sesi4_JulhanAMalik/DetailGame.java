/**
 *
 * @author julhan
 */
public class DetailGame {
    static int getDiscount(int harga_game, int diskon){
        return harga_game;
    }
    
    static double getDiscount(double harga_game, double diskon){
        diskon = diskon * harga_game;
        return harga_game - diskon;
    }
    public static void main(String[] args) {
        String nama_game = "Catur";
        String genre_game = "Logic";
        String rilis_game = "20 Maret 2024";
        int harga_game = 10000;
        
        double diskon_game = getDiscount(harga_game, 0.4);
        
        DevelopmentGame gamePub = new DevelopmentGame(nama_game, genre_game, rilis_game, "Julhan", "JuDul Production", harga_game);
        
        gamePub.InfoGame();
        System.out.println("Harga Diskon  : " + diskon_game);
    }
}
