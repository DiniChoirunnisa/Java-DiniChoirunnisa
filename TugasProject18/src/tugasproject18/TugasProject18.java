/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject18;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class Travel{
        String nama, jurusan, jenis;
        int total, jumlah_kursi, harga, ac, nonac, kembalian, jumlahuang, ulang ;
        
public Travel(){
    nama="";
    jurusan="";
    jenis="";
    ulang=0;
    harga=0;
    total=0;
    jumlah_kursi=0;
    ac=0;
    nonac=0;
    kembalian=0;
    jumlahuang=0;
    
}

//Procedure input
public void input (){
    Scanner input = new Scanner (System.in);
    
    System.out.println("======================================");
    System.out.println("          =          Jenis            ");
    System.out.println(" Jurusan  =    AC    =====    Non AC  ");
    System.out.println("======================================");
    System.out.println(" Banten   =  90.000  =====    70.000  ");
    System.out.println(" Semarang =  85.000  =====    60.000  ");
    System.out.println(" Jogja    =  60.000  =====    40.000  ");
    System.out.println("======================================");
    
    System.out.print("Masukkan Nama : ");
    nama=input.nextLine();
        
    System.out.print("Jurusan: ");
    jurusan=input.nextLine();
        
    System.out.print("Jenis : ");
    jenis=input.nextLine();

    System.out.print("Banyak Tiket : ");
    jumlah_kursi=input.nextInt();

}

//Function Ifelse
public void ifelse (){
switch(jurusan){
            case "Banten":
                if ("Non AC".equals(jenis))
                {
                harga=75000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=90000;
                } 
                break;
            case "Semarang": 
                if ("Non AC".equals(jenis))
                {
                harga=60000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=85000;
                } 
                break;
            case "Jogja": 
                if ("NA".equals(jenis))
                {
                harga=40000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=60000;
                } 
                break;
            default:
                jurusan="Maaf silahkan input ulang";
                break;
        }
}

            
//Function total
public int total(){
    total=harga*jumlah_kursi;
    return(total);
}


public void jumlahuang (){
    Scanner inp= new Scanner (System.in);
    
    System.out.println("Harga satuan untuk "+jurusan+" adalah "+harga);
    System.out.println("======================================");
    System.out.println(nama+" harus membayar sebesar "+total);
    
    System.out.print("Masukkan jumlah uang : ");
    jumlahuang=inp.nextInt();
    System.out.println("======================================");
            }          

//Function kembali
public int kembali(){
    kembalian=jumlahuang-total;
    return(kembalian);
}


//Procedure output
public void output(){
    Scanner ulg= new Scanner (System.in);
    System.out.println("kembalian "+kembalian);
    System.out.print("Ulangi lagi [Y/N]?");
    ulang=ulg.nextInt();
    System.out.println("======================================");
    
}
}

public class TugasProject18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Travel bis=new Travel();
    bis.input();
    bis.ifelse();
    bis.total();
    bis.jumlahuang();
    bis.kembali();
    bis.output();
    }
    
}
