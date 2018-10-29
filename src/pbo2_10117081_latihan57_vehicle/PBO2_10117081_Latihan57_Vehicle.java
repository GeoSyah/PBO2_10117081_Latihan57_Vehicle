/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tempsate file, choose Tools | Tempsates
 * and open the tempsate in the editor.
 */
package pbo2_10117081_latihan57_vehicle;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : memperlihatkan deskripsi kendaraan (Vehicle)
 *                  yaitu Sepeda (Bicycle) dan Papan Seluncur (Skateboard)
 */
public class PBO2_10117081_Latihan57_Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle sepeda = new Bicycle();
        sepeda.setBrand("Trek Bike");
        sepeda.setModel("7.4FX");
        sepeda.setGearCount(23);
        System.out.println("Brand : "+sepeda.getBrand());
        System.out.println("Model : "+sepeda.getModel());
        System.out.println("Jumlah Gear : "+sepeda.getGearCount());
        System.out.println("");
        
        Skateboard ps = new Skateboard();
        ps.setBrand("Ally ps");
        ps.setModel("Rocket");
        ps.setBoardLeght(54.5);
        System.out.println("Brand : "+ps.getBrand());
        System.out.println("Model : "+ps.getModel());
        System.out.println("Panjangnya Board : "+ps.getBoardLeght());
    }
    
}
