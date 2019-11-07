/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayamaskawin;

/**
 *
 * @author LENOVO
 */
public class EmasKawin {
    private String nama;
    private double beratMas;
    private double hargaMas;
    
    
    public EmasKawin(String nama,double beratMas,double hargaMas){
        this.nama=nama;
        this.beratMas=beratMas;
        this.hargaMas=hargaMas;
    }

    public String getNama() {
        return nama;
    }    
    
    public double getBeratMas() {
        return beratMas;
    }

    public double getHargaMas() {
        return hargaMas;
    }
    
    public void totalMasKawin(String nama,double beratMas,double hargaMas){
        double total=beratMas*hargaMas;
        System.out.println("Uang Yang Harus dipersiapkan "+nama+" Untuk MasKawinnya,Sebanyak "+total);
        
    }


    
    
    
    
}
