
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
    
    //accessor
    public String getNama() {
        return nama;
    }
    public int getUsia() {
        return usia;
    }
    public String getOlahraga() {
      return olahraga;
    }
    
    // Mutator
    public void setOlahraga(String olahraga) {
        this.olahraga = olahraga;
    }
}
