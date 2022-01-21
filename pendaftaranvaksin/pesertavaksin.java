package pendaftaranvaksin;

public class pesertavaksin extends Biodatavaksin {
    private String nik;
    private String umur;
    private String dosis;
    
    public pesertavaksin(String nik, String umur, String nama, String notelp, String alamat, String dosis){
        super(nama, notelp, alamat);
        this.nik = nik;
        this.umur = umur;
        this.dosis = dosis;
 
    }
    public String getumur(){
        return umur;
    }
    public void setumur(String umur){
        this.umur = umur;
    }
    
    public String getdosis(){
        return dosis;
    }
    
    public void dosis(String dosis){
        this.dosis = dosis;
    }
    
    public String getnik(){
        return nik;
    }
    public void setnik(String nik){
        this.nik = nik;
    }
 
}
