package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Facilities {
	Scanner scan = new Scanner(System.in);
	 Map<Integer,Cities> facilitiesList = new HashMap<Integer,Cities>();
	 
	 public void addFacility()
	 {
			Boolean stat=true;
		 Cities city = new Cities();
		 System.out.println("Podaj ID miasta:");
		 int cityId = scan.nextInt();
		 while(stat == true) {
			 if(facilitiesList.containsKey(cityId)) {
					System.out.println("Miasto o takim ID ju¿ istnieje, podaj inne ID");
				 cityId = scan.nextInt();
			 }
			 else 
			 {
				 System.out.println("Podaj nazwê miasta:");
				  city.cityName = scan.next();	  				 
				 city.addBranch();
				 facilitiesList.put(cityId, city);
				 stat = false;
				 }
				  }
	 }

	 public void facilitiesList()
		{

			facilitiesList.forEach((key, cities) -> {
				System.out.println(key + " = " +cities.cityName+" ");
				cities.branchsList();
			});
		}
}
