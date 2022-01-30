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
	int branchId=1;
	while(stat == true) {
		 if(branchsList.containsKey(branchId)) {
				branchId = branchId+1;
		 }	
	else {
		System.out.println("Podaj ulice, na ktorej lezy oddzial:");
		branch.branchStreet = scan.next();
		System.out.println("Podaj numer lokalu (dla blokow np. 10/31):");
		branch.branchAdressNumber = scan.next();
		branchsList.put(branchId,branch);
		stat = false;
	}
}
}

public void branchsList()
{
	System.out.println("Lista oddzialow:");
	branchsList.forEach((key, branch) -> {
		System.out.println("Id oddzialu: "+key+" Adres: " + branch.branchStreet +" "+branch.branchAdressNumber);
	});
}
public void branchDelete()
{
	int branchRemId;
	System.out.println("Podaj oddzial, ktory chcesz usunac:");
	branchRemId = scan.nextInt();
	branchsList.remove(branchRemId);
	System.out.println("Oddzial zostal usuniety.");
}

}
