/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject4;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int panjang, lebar, tinggi, LPbalok;
    Scanner LP = new Scanner (System.in);
    System.out.println("program volume balok");
    System.out.print("panjang : ");
    panjang=LP.nextInt();
    System.out.print("lebar : ");
    lebar=LP.nextInt();
    System.out.print("tinggi : ");
    tinggi=LP.nextInt();
    LPbalok=(2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
    System.out.print("Luas permukaan balok adalah " + LPbalok);

    }
    
}
