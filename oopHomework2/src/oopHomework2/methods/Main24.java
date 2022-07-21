package oopHomework2.methods;

public class Main24 {

	public static void main(String[] args) {
		
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int [] sayilar = {1,3,7,9};
		int aranacak = 1;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayı mevcuttur : " + aranacak);
		}else {
			mesajVer("Sayı mevcut değildir :" + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
