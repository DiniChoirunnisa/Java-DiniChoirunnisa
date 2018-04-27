/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int sisi, keliling;
    Scanner persegi = new Scanner (System.in);
    System.out.println("program keliling persegi");
    System.out.print("sisi : ");
    sisi=persegi.nextInt();
    keliling=4*sisi;
    System.out.print("Keliling persegi adalah " + keliling);
    }
    
}
