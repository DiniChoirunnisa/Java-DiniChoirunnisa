/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject5;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilai, hari;
    
    Scanner inputan = new Scanner (System.in);
    
    System.out.print ("masukkan nilai hari : ");
    hari=inputan.nextInt();
    
    if (hari==1)
    {
        System.out.print ("Senin");
    }
    else if (hari==2)
    {
        System.out.print ("Selasa");
    }
    else if (hari==3)
    {
        System.out.print ("Rabu");
    }
    else if (hari==4)
    {
        System.out.print ("Kamis");
    }
    else if (hari==5)
    {
        System.out.print ("Jumat");
    }
    else if (hari==6)
    {
        System.out.print ("Sabtu");
    }
    else if (hari==7)
    {
        System.out.print ("Minggu");
    }
    else
    {
        System.out.print ("pilihan tidak tersedia");
    }
    
}
}
