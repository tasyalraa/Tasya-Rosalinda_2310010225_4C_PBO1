
package manajemenolahraga;

public class Latihan extends KegiatanOlahraga {
    private String tanggal;
    private String jenisLatihan;
    
    public Latihan(String tanggal, String jenisLatihan) {
        super(jenisLatihan);
        this.tanggal = tanggal;
        this.jenisLatihan = jenisLatihan;
    }
    
    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nJenis Latihan: " + jenisLatihan;
    }
}
