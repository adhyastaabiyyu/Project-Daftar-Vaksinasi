package pendaftaranvaksin;

import java.util.Date;

import java.util.Scanner;

public class Pendaftaranvaksin {
    private static Scanner input = new Scanner(System.in);
    private static pesertavaksin[] PesertaEntity = new pesertavaksin[100];
    private static tenagakesehatan[] PanitiaEntity = new tenagakesehatan[100];
    private static pesertaterdaftar[] TerdaftarEntity = new pesertaterdaftar[100];
    private static int pilvaksin;
    private static int jumpeserta = 0;
    private static int cekpanitia;
    
    public static void main(String[] args){
        dataPanitia();
        int pil;
        do{
            System.out.println("Jumlah peserta : " + jumpeserta);
            System.out.println("1. Login panitia");
            System.out.println("2. Lihat peserta Terdaftar");
            System.out.println("3. Biodata panitia");
            
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1 :
                    loginPanitia();
                    break;
                case 2:
                    ViewPeserta();
                    break;
                case 3:
                    viewPanitia();
                    break;
            }
        } while(pil != 0);
    }
    
    static int dataPanitia(){
        String namaPanitia[] = {"Abiyu"};
        String passPanitia[] = {"07322"};
        
        String noTelpPanitia[] = {"081"};
        String alamatPanitia[] = {"Jl."};
        for(int i=0; i<namaPanitia.length; i++){
            PanitiaEntity[i] = new tenagakesehatan(passPanitia[i], namaPanitia[i], noTelpPanitia[i], 
            alamatPanitia[i]);
        }
        return namaPanitia.length;
    }
        
        


static void loginPanitia(){
System.out.println("Nama : ");
String nama = input.next();
        System.out.println("password :");
        String password = input.next();
        cekpanitia = login(nama, password);
        System.out.println("Selamat Datang " + PanitiaEntity[cekpanitia].getnama());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta :" + jumpeserta );
            System.out.println("1. datarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Lihat Peserta");
            System.out.println("4. Hapus Peserta");
            
            System.out.println("0. Log Out");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    updatePeserta();
                    break;
                case 3:
                    ViewPeserta();
                    break;
                case 4:
                    deletePeserta();
                    break;
        }
            
     }while(pil !=0);
}

            static int login(String nama, String password){
                int loop = 0;
                for (int i = 0; i <= dataPanitia(); i++){
                    if (PanitiaEntity[i].getnama().equals(nama)&& PanitiaEntity[i].getpassword().equals(password)){
                        break;
                    }else {
                        loop++;
                    }
                }
                return loop;
                
            }
            static void insertPeserta(){
            System.out.println("input nik :");
            String nik = input.nextLine();
            System.out.println("inpu nama :");
            String nama = input.nextLine();
            System.out.println("input umur :");
            String umur = input.nextLine();
            System.out.println("input alamat :");
            String alamat = input.nextLine();
            System.out.println("input notelp :");
            String noTelp = input.nextLine();
            System.out.println("input dosis :");
            String dosis = input.nextLine();
            
            PesertaEntity[jumpeserta] = new pesertavaksin(nik, umur, nama, noTelp, alamat, dosis);
            insertvaksin();
            }
            static void insertvaksin(){
            System.out.println("vaksin :");
            for (int i = 0; i < Tipevaksin.tipe.length; i++){
            System.out.println(i + ". " + Tipevaksin.tipe[i]);
            }
            System.out.println("pilih vaksin :");
            pilvaksin = input.nextInt();
            System.out.println("input Kode Peserta :");
            String KodePeserta = input.next();
            TerdaftarEntity[jumpeserta] = new pesertaterdaftar(PesertaEntity[jumpeserta], pilvaksin, KodePeserta);
            jumpeserta = jumpeserta + 1;
            }
            
            static void updatePeserta(){
            System.out.println("Masukkan kode peserta yang mau i EDIT : ");
            String search = input.next();
            int cari = 0;
            
            do{
            if (cari == jumpeserta){
            System.err.println("tidak ada data");
            break;
            }else if(TerdaftarEntity[cari].getKodePeserta().equals(search)){
            int pilEdit;
            
            do{
            System.out.println("Pilih data yang ingin diubah :");
            System.out.println("1. Lihat biodata :");
            System.out.println("2. nama :");
            System.out.println("3. alamat :");
            System.out.println("4. notelp :");
            System.out.println("5. umur :");
            System.out.println("6. vaksin:");
            System.out.println("7. dosis :");
            System.out.println("8. nik :");
            System.out.println("0. exit :");
            
            pilEdit = input.nextInt();
            input.nextLine();
            if (pilEdit == 1){
            System.out.println("================================");
            System.out.println("Kode pserta : " + TerdaftarEntity[cari].getKodePeserta());
            System.out.println("================================");
            System.out.println("Nama : " + PesertaEntity[cari].getnama() + "Nik : " + PesertaEntity[cari].getnik() + "\n umur : " + PesertaEntity[cari].getumur()
            + "\n alamat :" + PesertaEntity[cari].getalamat() + "\n noTelp : " + PesertaEntity[cari].getnotelp()
            + "\n Lomba : " + Tipevaksin.tipe[TerdaftarEntity[cari].indexvaksin()]);
            System.out.println("================================");
            }else if(pilEdit == 2){
            System.out.println("ubah nama : ");
            String editnama = input.nextLine();
            PesertaEntity[cari].setNama(editnama);
            }else if(pilEdit == 3){
            System.out.println("ubah alamat :");
            String editalamat = input.nextLine();
            PesertaEntity[cari].setalamat(editalamat);
            }else if(pilEdit == 4){
            System.out.println("ubah notelp :");
            String editnotelp = input.nextLine();
            PesertaEntity[cari].setnotelp(editnotelp);
            }else if(pilEdit == 5){
            System.out.println("Ubah umur :");
            String editumur = input.nextLine();
            PesertaEntity[cari].setumur(editumur);
            }else if(pilEdit == 6){
            System.out.println("pilih vaksin :");
            for (int i = 0; i < Tipevaksin.tipe.length; i++){
            System.out.println(i + ". " + Tipevaksin.tipe[i]);
            }
            System.out.println(" pilih tipe : ");
            int editvaksin = input.nextInt();
            TerdaftarEntity[cari].setindexvaksin(editvaksin);
            }else if(pilEdit == 7){
            System.out.println("Ubah Dosis :");
            String editdosis = input.nextLine();
            PesertaEntity[cari].dosis(editdosis);
            }else if(pilEdit == 8){
            System.out.println("Ubah Nik :");
            String editnik = input.nextLine();
            PesertaEntity[cari].setnik(editnik);
            }
            }while(pilEdit != 0);
            break;
            }else{
            cari = cari + 1;
            }
        }while(true);
    }
            static void ViewPeserta(){
            if (jumpeserta == 0){
            System.out.println("Belum ada peserta terdaftar");
            }else{
            for (int i = 0; i < jumpeserta; i++){
            System.out.println("==================================");
            System.out.println("Kode peserta :" + TerdaftarEntity[i].getKodePeserta());
            System.out.println("==================================");
            System.out.println("\nNama : " + PesertaEntity[i].getnama() + "\n Nik :" + PesertaEntity[i].getnik() + "\n umur : " + PesertaEntity[i].getumur()
            + "\n alamat :" + PesertaEntity[i].getalamat() + "\n noTelp : " + PesertaEntity[i].getnotelp() + "\n dosis : " + PesertaEntity[i].getdosis()
            + "\n vaksin : " + Tipevaksin.tipe[TerdaftarEntity[i].indexvaksin()] + "\n Berhasil Terdaftar \n" + PesertaEntity[i].getnama() + "\n vaksin dosis !! \n" + PesertaEntity[i].getdosis() );
            System.out.println("================================");
            }
        }
    }
            static void viewPanitia(){
            for (int i = 0; i < dataPanitia(); i++){
                System.out.println("==============================");
                System.out.println("\n nama : " + PanitiaEntity[i].getnama()+ "\n np. Telp : " + PanitiaEntity[i].getnotelp()
                + "\n alamat : " + PanitiaEntity[i].getalamat());
                System.out.println("==============================");
            }
        }
            
            static void deletePeserta(){
            System.out.println("Masukkan Kode Peserta yang akan dihapus :");
            String search = input.next();
            input.nextLine();
            int cari = 0;
            
            do{
            if (cari == jumpeserta){
            System.out.println("Tidak ada data!");
            break;
            }else if(TerdaftarEntity[cari].getKodePeserta().equals(search)){
            if (cari == jumpeserta - 1) {
            jumpeserta = jumpeserta - 1;
            }else {
            for (int i = cari; i < jumpeserta; i++){
            TerdaftarEntity[i] = TerdaftarEntity[i + 1];
            PesertaEntity[i] = PesertaEntity[i - 1];
            }
            jumpeserta = jumpeserta - 1;
            }
            break;
         }else {
            cari = cari + 1;
            }
        }while(true);
            }
            }
        




