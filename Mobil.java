/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author asus1
 */
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    // Getter methods
    public String getMerk() {
        return merk;
    }
    public String getModel() {
        return model;
    }
    public int getTahun() {
        return tahun;
    }
    public String getWarna() {
        return warna;
    }
    // Setter methods
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    // Method untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Mobil: " + merk + " " + model + ", Tahun: " + tahun + ", Warna: " + warna);
    }
    // Method untuk menyalakan mesin
    public void startEngine() {
        System.out.println("Mesin mobil: " + merk + " menyala");
    }
    
    // Method unutk mengubah warna mobil
    public void ubahWarna(String warnaBaru) {
        setWarna(warnaBaru);
        System.out.println("Warna mobil" + merk +" diubah menjadi" + warna);
    }
}
