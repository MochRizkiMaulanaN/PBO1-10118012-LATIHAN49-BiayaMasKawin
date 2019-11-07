
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayamaskawin;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("=== Rincian Mas Kawin ===");
        System.out.print("Nama : ");
        String nama=input.nextLine();
        System.out.print("Berat Mas Kawin : ");
        double berat=input.nextDouble();
        System.out.print("Harga Mas Bulan Oktober : ");
        double harga=input.nextDouble();
        EmasKawin EM=new EmasKawin(nama,berat,harga);
        EM.totalMasKawin(EM.getNama(), EM.getBeratMas(), EM.getHargaMas());
    }
    
}
