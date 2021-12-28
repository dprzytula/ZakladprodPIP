package PackageSystemu;
import java.util.Scanner;
public class managementsystem implements loginData {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=0;
		PracownikLP pr = new PracownikLP();
		Wlasciciel wl = new Wlasciciel();
		Klient kl = new Klient();
		System.out.println("Kim jestes?");
		System.out.println("1. Wlasciciel");
		System.out.println("2. Pracownik");
		System.out.println("3. Klient");
		a = scan.nextInt();	
		switch(a) {
		case 1: wl.FunkWlasc();break;
		case 2: pr.FunkPracownikLP();break;
		case 3: kl.MenuKlienta();break;
		}
		scan.close();
		
		
	}
}




