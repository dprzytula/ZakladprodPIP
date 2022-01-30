package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonelAccounts implements Menus{
	Scanner scan = new Scanner(System.in);
public Map <Integer,Account> accounts = new HashMap<Integer,Account>();

public void createAccount(Workers workers,PersonelAccounts peracc)
{
	int workerId;
	int counter=1;
	Boolean stat = true;
	var wrapper = new Object() {Boolean statLogin=true;	int modifyLog=0;};
	Account acc = new Account();
	Worker worker = new Worker();
	workers.workersList(workers);
	System.out.println("Podaj ID pracownika, ktoremu chcesz zalozyc konto.");
	workerId = scan.nextInt();
	worker = workers.workersList.get(workerId);	
	if(worker.account==true)System.out.println("Ten uzytkownik ma juz konto.");
	else {
	while(stat == true) {
		 if(peracc.accounts.containsKey(counter)) {
				counter = counter+1;
		 }
		 else {
			 System.out.println("Imie: "+worker.workerName+" Nazwisko: "+worker.workerSurname+ " Stanowisko:"+worker.role);
			 acc.login = worker.workerName+worker.workerSurname.charAt(wrapper.modifyLog++);
			 if(peracc.accounts.size()>0) {
	while(wrapper.statLogin==true) {
		acc.login = acc.login+worker.workerSurname.charAt(wrapper.modifyLog++);
	accounts.forEach((key, account) -> {
		if(account.login==acc.login) wrapper.modifyLog++;
		else wrapper.statLogin = false;
	});
	}
			 }
			 System.out.println("Login to: "+acc.login);
		 stat = false;
		 }
	}
	System.out.println("Podaj haslo dla uzytkownika:");
	acc.password = scan.next();
	System.out.println("Podaj kod pin dla uzytkownika:");
	acc.pin = scan.nextInt();
	worker.account = true;
	workers.workersList.replace(workerId, worker);
	peracc.accounts.put(counter,acc);
	}
}

public void showAccounts(PersonelAccounts peracc)
{
	peracc.accounts.forEach((key,account) -> {
		System.out.println(account.login+" "+account.password + " "+ account.pin);
		
	});
}
public void deleteAccount(PersonelAccounts peracc)
{
	int opt;
	showAccounts(peracc);
	System.out.println("Wybierz konto do usuniecia");
	opt = scan.nextInt();
	peracc.accounts.remove(opt);
	System.out.println("Konto zostalo usuniete");
}
public void functionsPerAcc(Workers workers,PersonelAccounts peracc)
{
	int opt;
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: createAccount(workers,peracc);break;
	case 2: deleteAccount(peracc);break;
	case 3: showAccounts(peracc);break;
	default: System.out.println("Wyjscie");break;
	}
}
@Override
public void operationsList() {
	System.out.println("1.Dodaj konto pracownika.");
	System.out.println("2.Usun konto pracownika.");
	System.out.println("3.Wyswietl konta pracownika.");
}

}
