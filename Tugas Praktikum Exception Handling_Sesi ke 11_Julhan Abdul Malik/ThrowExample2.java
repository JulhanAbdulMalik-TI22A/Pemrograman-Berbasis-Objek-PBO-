/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julha
 */
public class ThrowExample2 {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Exception");
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}

//  Blok try melempar pengecualian Exception dengan pesan kustom.
//  Blok catch di sini bersifat umum karena menangkap semua jenis pengecualian Exception-
//  (dan subkelasnya). Ini berguna untuk menangani berbagai jenis pengecualian yang tidak terduga.