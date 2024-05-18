/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julhan
 */
public class ThrowExample {
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan;
        System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
    try
        {
            demo();
            System.out.println("Selesai");
        }
            catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: "+e);
        }
    }
}

//  Blok try membungkus panggilan metode demo(), yang diketahui dapat melempar NullPointerException.
//  Blok catch dalam program ini menangkap pengecualian NullPointerException dan mencetak pesan errornya.