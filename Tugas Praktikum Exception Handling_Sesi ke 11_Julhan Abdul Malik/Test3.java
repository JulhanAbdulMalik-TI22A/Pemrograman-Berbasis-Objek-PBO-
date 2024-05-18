
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julhan
 */

public class Test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args)
        {
            Test3 o=new Test3();
            o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
    }
}

//  Keyword throws digunakan dalam deklarasi method signature untuk menginformasikan 
//  kepada pemanggil method (metode yang memanggil methodB()) bahwa method tersebut  
//  mungkin melempar pengecualian tertentu.
