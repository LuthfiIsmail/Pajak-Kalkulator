/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kang L
 */
public class Karyawan {
    private String nama;
    private double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    String getNama() {
        return this.nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    double getGaji() {
        return this.gaji;
    }

    public double hitungPajak() {
        double persentasePajak = 2.5;
        double pajak = gaji * (persentasePajak / 100);
        return pajak;
    }

}
