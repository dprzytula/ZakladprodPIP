package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cities {
	Scanner scan = new Scanner(System.in);
String cityName;
Map<Integer,Branch> branchsList = new HashMap<Integer,Branch>();
public void addBranch()
{
	Boolean stat = true;
	Branch branch = new Branch();
	System.out.println("Podaj ID oddzia�u:");
	int branchId = scan.nextInt();
	while(stat==true) {
	if(branchsList.containsKey(branchId)) {
		System.out.println("Oddzia� o takim ID istnieje ju� w tym mie�cie, poddaj inne ID");
		branchId = scan.nextInt();
	}
	else {
		System.out.println("Podaj ulic�, na kt�rej le�y oddzia�:");
		branch.branchStreet = scan.next();
		System.out.println("Podaj numer lokalu (dla blok�w np. 10/31):");
		branch.branchAdressNumber = scan.next();
		branchsList.put(branchId,branch);
		stat = false;
	}
}
}

public void branchsList()
{

	branchsList.forEach((key, branch) -> {
		System.out.println(key + " = " + branch.branchStreet +" "+branch.branchAdressNumber);
	});
}
}
