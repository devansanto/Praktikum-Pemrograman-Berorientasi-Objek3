/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author asus1
 */
public class PraktikumPBO_3 {
    public static void main(String[] args) {
        // Membuat objek pertama dari class Mobil
        Mobil mobil1 = new Mobil("Nissan", "Skyline", 2024, "Putih");
        mobil1.displayInfo();
        mobil1.startEngine();

        // Membuat objek kedua dari class Mobil
        Mobil mobil2 = new Mobil("Jeep", "Rubicon", 2023, "Hitam");
        mobil2.displayInfo();
        mobil2.startEngine();
        
        // Mengubah warna mobil pertama dan kedua
        mobil1.setWarna("Merah Muda");
        mobil1.displayInfo();
        mobil2.setWarna("Merah");
        mobil2.displayInfo();
    }
}
