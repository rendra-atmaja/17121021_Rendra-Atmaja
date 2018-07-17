//	Nama 	: Rendra Atmaja
//	NIM		: 17121021
//	Jurusan	: Sistem Informasi
//	Dengan Konsep ENKAPSULASI

public class Hp {
    public static void main(String[] args) {
        Android Android1 = new Android();
        
		System.out.println("\n");
        System.out.println("Tipe Android 1 = "+Android1.getTipe());
        System.out.println("Merk Android 1 = "+Android1.getMerk());
        
        System.out.println("\n\nRubah Android 1");
        Android1.setTipe("A83");
        Android1.setMerk("OPPO");        
        System.out.println("Tipe Android 1 = "+Android1.getTipe());
        System.out.println("Merk Android 1 = "+Android1.getMerk());
		System.out.println("\n");
        
        Android Android2 = new Android("Mi 5","Xioami");
        System.out.println("Tipe Android 2 = "+Android2.getTipe());
        System.out.println("Merk Android 2 = "+Android2.getMerk());
		System.out.println("\n");
        
        System.out.println("Rubah Android 2");
        Android2.setTipe("S8");
        Android2.setMerk("Samsung");        
        System.out.println("Tipe Android 2 = "+Android2.getTipe());
        System.out.println("Merk Android 2 = "+Android2.getMerk());
    }
}