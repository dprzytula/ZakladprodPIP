package PackageSystemu;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	void RoleList() {
		System.out.println("1. Wlasciciel");
		System.out.println("2. Pracownik");
		System.out.println("3. Klient");
	}
	
	
	void MainMenu() {
		System.out.println("Witamy w Naszym Zakladzie!");
		System.out.println("Wybierz swoj¹ rolê:");
		RoleList();
	}
	
	
	
	
	
}
