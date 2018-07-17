//	Nama 	: Rendra Atmaja
//	NIM		: 17121021
//	Jurusan	: Sistem Informasi
//	Dengan Konsep ENKAPSULASI

public class Android {
    String Tipe;
    String merk;
    
    public Android(){
        this.Tipe="Redmi 3";
        this.merk="Xiaomi";
    }
    public Android(String t, String m){
        this.Tipe = t;
        this.merk = m;
    }    
    public void setTipe(String t){
        this.Tipe=t;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public String getTipe(){
        return this.Tipe;
    }
    public String getMerk(){
        return this.merk;
    }
}