package oopHomework2.methods2;

public class Main25 {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(4,7);
		System.out.println(sayi);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil(){
		System.out.println("Sildi");
	}
	
	public static void guncelle(){
		System.out.println("Güncelledi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	
	


}
