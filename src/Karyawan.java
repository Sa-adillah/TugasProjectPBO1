import java.util.Date;

//superclass
public class Karyawan {
    //attribut
    private int id;
    private String namaLengkap;
    private String gender;
    private Date tglLahir;
    private Date tglMasuk;
    private String jabatan;
    private String alamat;
    private String telepon;

    //method
    public  void mengisiAbsemDatang(){
        System.out.println("karyawan Mengisi Absen Datang");
    }

    public void mengecekBarangDatang(){
        System.out.println("Karyawan Melakukan Pengecekan Barang");
    }

    public void mengirimBarang(){
        System.out.println("Karyawan Mengirim Barang ke Cabang");
    }

    public void mengisiAbsenPulang(){
        System.out.println("Karyawan mengisi Absen Pulang");
    }

    //constructor
    public Karyawan() {
    }

    public Karyawan(int id, String namaLengkap, String gender, Date tglLahir, Date tglMasuk, String jabatan, String alamat, String telepon) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.gender = gender;
        this.tglLahir = tglLahir;
        this.tglMasuk = tglMasuk;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public Karyawan(int id, String namaLengkap, String gender) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.gender = gender;
    }
}
