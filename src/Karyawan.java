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

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public Date getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(Date tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
