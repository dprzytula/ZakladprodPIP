package ManagSystem;

import java.util.Scanner;

public class Main {

	public static Facilities facilities = new Facilities();
	public static Office office = new Office();
	public static Storage storage = new Storage();
	public static Workers workers = new Workers();
	public static PersonelAccounts peracc = new PersonelAccounts();
	public static Account acc = new Account();

	public static void main(String [] args) {

		Scanner scan = new Scanner(System.in);
		Login log = new Login();
		acc.login = "owner";
		acc.password = "hardpass";
		acc.pin = 1024;
		peracc.accounts.put(0, acc);

		for(int i = 0;i < 10;i++) {
			Worker w = new Worker();
			w.workerName = "p"+i;
			w.workerSurname = "Duds"+i;
			w.salary = 1500;
			w.role = "OfficeWorker";
			w.account = false;
			workers.addSingleWorker(w);

			Account ac = new Account();
			ac.login = w.workerName;
			ac.password = "qwerty";
			ac.pin = 123;
			ac.workerID = w.workerID;
			peracc.accounts.put(i+1, ac);
		}

		for(int i = 10;i < 20;i++) {
			Worker w = new Worker();
			w.workerName = "p"+i;
			w.workerSurname = "Duds"+i;
			w.salary = 1500;
			w.role = "StorageWorker";
			w.account = false;
			workers.addSingleWorker(w);

			Account ac = new Account();
			ac.login = w.workerName;
			ac.password = "qwerty";
			ac.pin = 123;
			ac.workerID = w.workerID;
			peracc.accounts.put(i+1, ac);
		}


		log.login(workers,storage,facilities,office,peracc);

		//Office ofc = new Office();
		//ofc.addRaport();
		//ofc.addRaport();
		//ofc.raportsList();
		//ofc.raportShowData();
		//ofc.addDocument();
		//ofc.addDocument();
		//ofc.documentsList();
		//ofc.documentShowData();
		//ofc.selectOperation();
		//Cities city = new Cities();
		//city.addBranch();
		//city.branchsList();
		//city.addBranch();
		//city.branchsList();
	/*	Facilities fac = new Facilities();
		fac.addFacility();
		fac.facilitiesList();
		fac.addFacility();
		fac.facilitiesList();
		fac.branchDelete();
		fac.facilitiesList();
		fac.cityDelete();
		fac.facilitiesList();*/
	/*	Orders orders = new Orders();
		orders.createOrder();
		orders.ordersList();
		orders.realizeOrder();
		orders.ordersList();*/
	/*	PersonelAccounts pa = new PersonelAccounts();
		Workers workers = new Workers();
		workers.addWorker();
		workers.addWorker(); 
		workers.workersList();
		pa.createAccount(workers);
		pa.showAccounts();
		pa.createAccount(workers);
		pa.showAccounts();*/
		

	}
}
