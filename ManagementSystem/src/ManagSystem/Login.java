package ManagSystem;

import java.util.Iterator;
import java.util.Scanner;

public class Login {
	Scanner scan = new Scanner(System.in);
	public Boolean loginOwner(PersonelAccounts peracc,String login,String password,int pin)
	{
		Account acc = new Account();
		acc = peracc.accounts.get(0);


		if(acc.login.contains(login) && acc.password.contains(password)&& acc.pin == pin) return true;
		else return false;
	}
	public int loginWorker(PersonelAccounts peracc,String login,String password,int pin)
	{
		int loginStat=-1;
		int key=1;


		Account acc = new Account();
		Iterator<Integer> ac_it = peracc.accounts.keySet().iterator();
		while(ac_it.hasNext()) {
			key = (int)ac_it.next();
			acc = peracc.accounts.get(key);
			System.out.println(acc.login +" "+acc.password + " " + acc.workerID);
			if(acc.login.equals(login) && acc.password.equals(password)&& acc.pin == pin) {

				return acc.workerID;

			}

		}
		return loginStat;
	}

	public void login(Workers workers,Storage storage,Facilities facilities,Office office,PersonelAccounts peracc){
		int opt;

		while(true) {
			Owner own = new Owner();
			System.out.println("Kim jestes?");
			System.out.println("1.Właścicielem");
			System.out.println("2.Pracownikiem");
			System.out.println("3.Klientem");

			opt = scan.nextInt();
			String login,password;
			int pin;
			System.out.println("Podaj login:");
			login = scan.next();
			System.out.println("Podaj haslo:");
			password = scan.next();
			System.out.println("Podaj pin:");
			pin = scan.nextInt();


			switch(opt)
			{
				case 1: {
					if(loginOwner(peracc,login,password,pin))
					{

						own.ownerFunctions(workers,storage,facilities,office,peracc);
					}
					else System.out.println("Niepoprawne dane!");
				}break;

				case 2: {
					int workerID = loginWorker(peracc,login,password,pin);
					if(workerID != -1)
					{
						//Logowanie / sprawdzenie
						Worker worker = workers.workersList.get(workerID);
						if(worker.role.equals("OfficeWorker")){
							office.selectOperation(office);
						}
						if(worker.role.equals("StorageWorker")){
							storage.selectOperation(storage);
						}



					}
					else System.out.println("Niepoprawne dane!");
				}break;

			}
		}
	}

}