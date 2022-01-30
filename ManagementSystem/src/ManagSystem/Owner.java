package ManagSystem;

import java.util.Scanner;

public class Owner{
	Scanner scan = new Scanner(System.in);
	
public void ownerFunctions(Workers workers,Storage stor,Facilities fac,Office office,PersonelAccounts peracc){
	Boolean stat=true;
			
	int opt;
	while(stat==true) {
	System.out.println("Wybierz co chcesz zrobic:");
	System.out.println("1.Zarzadzaj placowkami");
	System.out.println("2.Zarzadzaj pracownikami");
	System.out.println("3.Zarzadzaj kontami pracownikow");
	System.out.println("4.Zarzadzaj biurem");
	System.out.println("5.Zarzadzaj magazynem");
	System.out.println("6.Wyloguj");
	opt = scan.nextInt();
	if(opt == 6) stat=false;
	operationsList(opt,fac,workers,stor,office,peracc);
	functions(opt, fac,workers,stor,office,peracc);
	}
	
}

public void functions(int opt,Facilities fac,Workers workers,Storage storage,Office office,PersonelAccounts peracc) {
	switch(opt) {
	case 1: fac.functionsFacilities(fac);;break;
	case 2: workers.functionsWorkers(workers);break;
	case 3: peracc.functionsPerAcc(workers,peracc);break;
	case 4: office.functionsOffice(office);break;
	case 5: storage.selectOperation(storage);break;
	default: System.out.println("Wyjscie.");break;
	}
}
public void operationsList(int opt,Facilities fac,Workers workers,Storage storage,Office office,PersonelAccounts peracc) {
	switch(opt) {
	case 1: fac.operationsList();break;
	case 2: workers.operationsList();break;
	case 3: peracc.operationsList();break;
	case 4: office.operationsList();break;
	case 5: storage.operationsList();break;
	default: System.out.println("Wyjscie.");break;
	}
}
}
