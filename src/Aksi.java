import java.util.Date;

//class untuk menciptakan object
public class Aksi {
    public static void main(String[] args) {
        Karyawan sadil = new Karyawan();
        Karyawan ani = new Karyawan();
        Karyawan dillah = new Karyawan(2,"dillah","Laki-laki",new Date(),new Date(),"Administrasi","Banjarbaru","081545709220");
        Karyawan susilawati = new Karyawan(3, "susilawati","Perempuan",new Date(),new Date(),"Marketing","Landasan Ulin","081545709230");
        Karyawan agus = new Karyawan(4, "agus", "Laki Laki");
        Karyawan wati = new Karyawan(5,"wati","Perempuan");


    }
}
