package PackageSystemu;
import java.util.Scanner;
public class managementsystem implements loginData {
	
	public static void main(String[] args){
	//	Scanner scan = new Scanner(System.in);
	//	int a=0;
		Pracownicy prs = new Pracownicy();
		/*
		if(prs.checkRole() == "PracownikStg")
		{
			PracownikStorage prStg = new PracownikStorage();
			prStg.PracStorageMenu();
		}*/
		String role = prs.PracownikLogin();
		if(role=="PracownikStg")
		{
			PracownikStorage pr1 = new PracownikStorage();
			pr1.PracownikStgMenu();
		}
		else if(role=="PracownikOff")
		{
			PracownikOFFICE pr2 = new PracownikOFFICE();
			pr2.PracownikOffMenu();
		}
		else System.out.println("Nie jest pracownikiem");
		//PracownikLP pr = new PracownikLP();
		
		//Wlasciciel wl = new Wlasciciel();
		//Klient kl = new Klient();
	/*	System.out.println("Kim jestes?");
		System.out.println("1. Wlasciciel");
		System.out.println("2. Pracownik");
		System.out.println("3. Klient");
		a = scan.nextInt();	
		switch(a) {
		case 1: wl.FunkWlasc();break;
		case 2: pr.FunkPracownikLP();break;
		case 3: kl.MenuKlienta();break;
		}
		scan.close();*/
		//pr.CreateRaport();
	//	wl.RaportsList();
	
		//pr2.PartsList();
	
	}
}




