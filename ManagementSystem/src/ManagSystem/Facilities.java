package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Facilities implements Menus{
	Scanner scan = new Scanner(System.in);
	 Map<Integer,Cities> facilitiesList = new HashMap<Integer,Cities>();
	 
	 public void addFacility(Facilities facil)
	 {
		 int opt;
		 Boolean statBranch=true;
			Boolean stat=true;
		 Cities city = new Cities();
		 int cityId = 1;
		 while(stat == true) {
			 if(facil.facilitiesList.containsKey(cityId)) {
				 cityId = cityId+1;
			 }	
			 else 
			 {
				 System.out.println("Podaj nazwe miasta:");
				  city.cityName = scan.next();	 
				  while(statBranch == true) {
					  city.addBranch();
					  System.out.println("Czy dodac kolejny oddzial?\n1.Tak.\nInny. Nie.");
					  opt = scan.nextInt();
				 switch (opt) {
				 case 1: statBranch=true;break;
				 default: statBranch=false;break;
				 } 
				 }
				  facil.facilitiesList.put(cityId, city);
				 stat = false;
				 }
				  }
	 }
	 public void cityDelete(Facilities facil)
	 {
		 int cityId;
		 facilitiesList(facil);
		 System.out.println("Podaj ID miasta, ktore chcesz usunac:");
		 cityId = scan.nextInt();
		 facil.facilitiesList.remove(cityId);
		 System.out.println("Usunieto miasto.");
		 
	 }
	 public void branchDelete(Facilities facil) {
		 int cityId;
		 Cities city = new Cities();
		  System.out.println("Podaj ID miasta: ");
		  cityId = scan.nextInt();
		  city = facil.facilitiesList.get(cityId);
		  city.branchDelete();
	 }
	 public void selectDelete(Facilities facil)
	 {
		 int opt;
		  System.out.println("Co chcesz usunac?");
		  System.out.println("1.Miasto");
		  System.out.println("2.Oddzial");
		  System.out.println("Inny. Nic nie usuwam.");
		 opt = scan.nextInt();
		 switch(opt)
		 {
		 case 1: cityDelete(facil);break;
		 case 2: branchDelete(facil);break;
		 default: break;
		 }
	 }
	 public void addBranch(Facilities facil) {
		 Cities cit = new Cities();
		 int opt;
		 System.out.println("Ktorej placowce chcesz dodac oddzial?");
		 opt = scan.nextInt();
		 cit = facilitiesList.get(opt);
		 cit.addBranch();
	 }
	 public void functionsFacilities(Facilities facil) {
		 int opt;
		 opt = scan.nextInt();
		 switch(opt)
		 {
		 case 1: addFacility(facil);break;
		 case 2: addBranch(facil);break;
		 case 3: facilitiesList(facil);break;
		 case 4: selectDelete(facil);break;
		 default: System.out.println("Wyjscie");
		 }
	 }
	 public void facilitiesList(Facilities facil)
		{

		 facil.facilitiesList.forEach((key, cities) -> {
				System.out.println("Id miasta: "+key+" Nazwa miasta: "+cities.cityName);
				cities.branchsList();
			});
		}
	@Override
	public void operationsList() {
		System.out.println("1.Dodaj placowke.");
		System.out.println("2.Dodaj oddzial");
		System.out.println("3.Wyswietl placowki i oddzialy.");
		System.out.println("4.Usun placowki lub oddzial.");
		
	}
	 
}
