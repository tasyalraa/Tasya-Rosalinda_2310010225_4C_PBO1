
package manajemenolahraga;


public class Anggota extends KegiatanOlahraga {
    private String nama;
    private int usia;
    private String olahraga;
    
    public Anggota(String nama, int usia, String olahraga) {
        super(olahraga);
        this.nama = nama;
        this.usia = usia;
        this.olahraga = olahraga;
    }
}
