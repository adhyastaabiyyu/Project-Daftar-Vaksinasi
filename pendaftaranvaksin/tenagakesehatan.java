package pendaftaranvaksin;

public class tenagakesehatan extends Biodatavaksin {
    private String password;
    public tenagakesehatan(String password, String nama, String notelp, String instansi){
        super(nama, notelp, instansi);
        this.password = password;
    }
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
}