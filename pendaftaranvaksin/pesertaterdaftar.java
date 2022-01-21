package pendaftaranvaksin;

public class pesertaterdaftar {
    private pesertavaksin pesertaEntity;
    private int indexvaksin;
    private String KodePeserta;
    
    public pesertaterdaftar(pesertavaksin pesertaEntity, int indexvaksin, String KodePeserta){
        this.pesertaEntity = pesertaEntity;
        this.indexvaksin = indexvaksin;
        this.KodePeserta = KodePeserta;
    }
    
    public pesertavaksin getpesertaEntity(){
        return pesertaEntity;
    }
    
    public void setpesertaEntity(pesertavaksin pesertaEntity){
        this.pesertaEntity = pesertaEntity;
    }
    
    public int indexvaksin(){
        return indexvaksin;
    } 
    
    public void setindexvaksin(int indexvaksin){
        this.indexvaksin = indexvaksin;
    }
    
    public String getKodePeserta(){
        return KodePeserta;
    }
    
    public void setKodePeserta(String KodePeserta){
        this.KodePeserta = KodePeserta;
    }
}
