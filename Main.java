/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author asus1
 */
public class Main {
    public static void main(String[] args) {
        // Membuat dua object dari class Mobil
        Mobil mobil1 = new Mobil("Nissan", "Skyline", 2024, "Putih");
        Mobil mobil2 = new Mobil("Jeep", "Rubicon", 2023, "Hitam");

        // Menampilkan informasi kedua mobil
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Menyalakan mesin kedua mobil
        mobil1.startEngine();
        mobil2.startEngine();

        // Mengubah warna mobil dan menampilkan informasi kembali
        mobil1.ubahWarna("Merah Muda");
        mobil1.displayInfo();

        mobil2.ubahWarna("Merah");
        mobil2.displayInfo();
    }
}

