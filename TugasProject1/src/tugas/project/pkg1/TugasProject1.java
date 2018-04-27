/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project.pkg1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sisi, luas;
    Scanner persegi = new Scanner (System.in);
    System.out.println("program luas persegi");
    System.out.print("sisi : ");
    sisi=persegi.nextInt();
    luas=sisi*sisi;
    System.out.print("Luas persegi adalah " + luas);
    }
    
}
