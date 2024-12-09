package Praktikum.pert9.pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari setiap kelas
        Manager managerObj = new Manager();
        Kasir kasirObj = new Kasir();
        Koki kokiObj = new Koki();
        Pelayan pelayanObj = new Pelayan();
        Satpam satpamObj = new Satpam();

        // Mengisi atribut pada objek
        managerObj.nama = "Sifa";
        managerObj.id_pegawai = 1;
        managerObj.gaji = "7 Juta";

        kasirObj.nama = "Aldi";
        kasirObj.id_pegawai = 2;
        kasirObj.gaji = "1,2 Juta";

        kokiObj.nama = "Reza";
        kokiObj.id_pegawai = 3;
        kokiObj.gaji = "2 Juta";

        pelayanObj.nama = "Dean";
        pelayanObj.id_pegawai = 4;
        pelayanObj.gaji = "1,2 Juta";

        satpamObj.nama = "Aldi";
        satpamObj.id_pegawai = 5;
        satpamObj.gaji = "1 Juta";

        // Memanggil fungsi menampilkan() dan tugas() untuk setiap objek
        System.out.println("Data Pegawai:");
        managerObj.menampilkan();
        managerObj.tugas();

        kasirObj.menampilkan();
        kasirObj.tugas();

        kokiObj.menampilkan();
        kokiObj.tugas();

        pelayanObj.menampilkan();
        pelayanObj.tugas();

        satpamObj.menampilkan();
        satpamObj.tugas();
    }
}

