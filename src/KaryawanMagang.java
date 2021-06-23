//subclass
public class KaryawanMagang extends Karyawan {
    //attribut
    public String nidk;
    public String asalPendidikan;
    public int lamaMagang;

    //method
    public void menerimaPanggilan(){
        System.out.println("Karyawan Magang Menerima Panggilan dari Konsumen");
    }

    public void membersihkanRuangan(){
        System.out.println("Karyawan Magang Membersihkan Ruangan Kerja");
    }
}
