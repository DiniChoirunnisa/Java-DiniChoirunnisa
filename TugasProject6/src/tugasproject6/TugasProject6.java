/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject6;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilai, waktu;
    
    Scanner inputan = new Scanner (System.in);
    
    System.out.print ("masukkan jam : ");
    waktu=inputan.nextInt();
    
    if (waktu>=5 && waktu<=11)
    {
        System.out.print ("Pagi");
    }
    else if (waktu>=12 && waktu<=18)
    {
        System.out.print ("Siang");
    }
    else if (waktu>=19 && waktu<=24)
    {
        System.out.print ("Malam");
    }
    else if (waktu>=1 && waktu<=4)
    {
        System.out.print ("Dini hari");
    }
    }
    
}
