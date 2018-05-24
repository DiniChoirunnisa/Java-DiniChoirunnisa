/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject19;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class toko{
        String nama,status, barang;
        int kuantitas,harga, total, kembali, jumlahuang;
Scanner input= new Scanner(System.in);

//contructor
public toko(){
    nama="";
    status="";
    barang="";
    kuantitas=0;
    harga=0;
    total=0;
    kembali=0;
    jumlahuang=0;
}        

//Procedure input
public void input (){
    
        System.out.print("Nama : ");
        nama=input.nextLine();   
        
        System.out.print("Status [Member/Non Member] : ");
        status=input.nextLine();
        
        System.out.print("Pembelian Barang [kulkas/TV/motor] : ");
        barang=input.nextLine();        
      
        System.out.print("Kuantitas : ");
        kuantitas=input.nextInt();

}

//Function Ifelse
public int ifelse (){
switch(barang){
            case "kulkas":
            if ("member".equals(status))
                {
                harga=3500000-3500000*10/100;
                }
               else if ("non".equals(status)) 
                {
                harga=3500000;
                } 
                break;
            case "TV":
            if ("member".equals(status))
                {
                harga=2100000-2100000*10/100;
                }
               else if ("non".equals(status)) 
                {
                harga=2100000;
                } 
                break;
            case "motor":
            if ("member".equals(status))
                {
                harga=15000000-15000000*10/100;
                }
               else if ("non".equals(status)) 
                {
                harga=15000000;
                } 
                break;
            default:
                barang="Maaf barang tidak tersedia";
                break;
           }  
    return harga;
    }

//Function total
public int total(){
    total=harga*kuantitas;
    return(total);
}


 public void output(){
        ifelse();
        total();   
        System.out.println("Total harga :  "+total);
        bayar();
        kembalian();
        System.out.println("kembalian : "+kembali);
        System.out.println("Terimakasih sudah membeli");
    }
 
public void bayar(){
    
    System.out.print("Masukkan jumlah uang : ");
        jumlahuang=input.nextInt();
    } 
    
    public int kembalian(){
        kembali = jumlahuang-total; 
        return kembali;
    } 
    
}
public class TugasProject19 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
    
        toko tk = new toko();
        tk.input();
        tk.ifelse();
        tk.output();
    }
    
}
