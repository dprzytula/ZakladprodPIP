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
	System.out.println("Podaj ID oddzia³u:");
	int branchId = scan.nextInt();
	while(stat==true) {
	if(branchsList.containsKey(branchId)) {
		System.out.println("Oddzia³ o takim ID istnieje ju¿ w tym mieœcie, poddaj inne ID");
		branchId = scan.nextInt();
	}
	else {
		System.out.println("Podaj ulicê, na której le¿y oddzia³:");
		branch.branchStreet = scan.next();
		System.out.println("Podaj numer lokalu (dla bloków np. 10/31):");
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
