/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanenkapulasi2;

/**
 *
 * @author ACER
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Membuat object busBesar dari class Bus.
        Bus busBesar = new Bus(40);
        busBesar.cetak();

        //Penambahan Penumpang.
        busBesar.addPenumpang(15); //Menambahkan 15 penumpang.
        busBesar.cetak();

        //Penambahan Penumpang.
        busBesar.addPenumpang(5); //Menambahkan 5 penumpang.
        busBesar.cetak();

        //Penambahan Penumpang.
        busBesar.addPenumpang(26); //Menambahkan 26 penumpang.
        busBesar.cetak();        
    }
}
