/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * KELAS    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program ini untuk menampilkan value dari variabel
 *                      jumlahKambing
 */
public class Testing {

    public void tambahKambing() {
        
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing Setelah Ditambah: "+ jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Testing kambingJantan = new Testing();
       kambingJantan.tambahKambing();
    }
    
}
