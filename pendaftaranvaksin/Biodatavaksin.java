package pendaftaranvaksin;

public class Biodatavaksin {
protected String nama,notelp,alamat;

    public Biodatavaksin(String nama, String notelp, String alamat) {
        this.nama = nama;
        this.notelp = notelp;
        this.alamat = alamat;
       
    }
    
    public String getnama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getnotelp(){
        return notelp;
    }
    
    public void setnotelp(String notelp){
        this.notelp = notelp;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    
}
