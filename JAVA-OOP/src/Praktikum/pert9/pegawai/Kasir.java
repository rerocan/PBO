package Praktikum.pert9.pegawai;

public class Kasir extends Pegawai {
    @Override
    public void menampilkan(){
        System.out.println("Nama    : " + nama);
        System.out.println("id Pegawai  :" + id_pegawai);
        System.out.println("Gaji    :" + gaji);
    }
    
    public void tugas(){ 
        System.out.println("Tugas   : Melakukan Transaksi Dengan Pembeli");
        System.out.println("-------------------------------------------------");
    }
}
