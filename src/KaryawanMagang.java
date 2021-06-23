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

    //getter and setter
    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public String getAsalPendidikan() {
        return asalPendidikan;
    }

    public void setAsalPendidikan(String asalPendidikan) {
        this.asalPendidikan = asalPendidikan;
    }

    public int getLamaMagang() {
        return lamaMagang;
    }

    public void setLamaMagang(int lamaMagang) {
        this.lamaMagang = lamaMagang;
    }
}
