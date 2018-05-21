/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject17;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class sidang{
        String nama,mutu;
        Double nim, np1, np2, np,total;
        
        
//contructor
public sidang(){
    nama="";
    mutu="";
    nim=0.0;
    np=0.0;
    np1=0.0;
    np2=0.0;
    total=0.0;
}
//Procedure input
public void input (){
    Scanner input = new Scanner (System.in);
    System.out.println("DATA MAHASISWA");
    System.out.print("Masukkan Nama : ");
    nama=input.nextLine();
        
    System.out.print("Masukkan Nomor Induk Mahasiswa : ");
    nim=input.nextDouble();
        
    System.out.print("Masukkan Nilai Pembimbing : ");
    np=input.nextDouble();

    System.out.print("Masukkan Nilai Penguji 1 : ");
    np1=input.nextDouble();

    System.out.print("Masukkan Nilai Penguji 2 : ");
    np2=input.nextDouble();

}

//Function total
public double total(){
    return ((np*0.4)+(np1*0.3)+(np2*0.3));
}

//Function Ifelse
public void ifelse (){
if (total>=81 && total<=100)
    {
        mutu="Grade A";
    }
    else if (total>=71 && total<=80)
    {
        mutu="Grade B";
    }
    else if (total>=61 && total<=70)
    {
        mutu="Grade C";
    }
    else if (total<=60)
    {
        mutu="Grade D";
    }
}

//Procedure output
public void output(){
    System.out.println("Nama : "+ nama);
    System.out.println("Nomor Induk Mahasiswa: "+ nim);
    System.out.println("Nilai Pembimbing : "+np);
    System.out.println("Nilai Penguji 1 : " +np1);
    System.out.println("Nilai Penguji 2 : " +np2);
    System.out.println ("Total: "+total());
    System.out.println ("Huruf Mutu: "+ mutu);
}
}
public class TugasProject17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    sidang mhs=new sidang();
    mhs.input();
    mhs.total();
    mhs.ifelse();
    mhs.output();
    }
    
}
