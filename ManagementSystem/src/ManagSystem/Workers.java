package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Workers implements Menus{
	Scanner scan = new Scanner(System.in);
public Map<Integer,Worker> workersList = new HashMap<Integer,Worker>();



public String workersRoles()
{
	int opt;
	System.out.println("Wybierz rolę pracownika:");
	System.out.println("1.Pracownik biura.");
	System.out.println("2.Pracownik magazynu.");
	System.out.println("3.Pracownik linii produkcyjnej.");
	System.out.println("Inny. Brak roli");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: return "OfficeWorker";
	case 2: return "StorageWorker";
	case 3: return "ProductionLineWorker";
	default: return "";
	}
}

public int addSingleWorker(Worker w){
	int workerId=1;
	while(workersList.containsKey(workerId))
		workerId++;

	workersList.put(workerId,w);
	w.workerID = workerId;
	return workerId;
}

public void addWorker(Workers workersList) {
	int workerId=1;
	if(workersList.workersList.containsKey(workerId)) {
		workerId = workerId+1;
	 }
	Worker worker = new Worker();
	System.out.println("Dodawanie nowego pracownika:");
	System.out.println("Podaj imię pracownika:");
	worker.workerName = scan.next();
	System.out.println("Podaj nazwisko pracownika:");
	worker.workerSurname = scan.next();
	worker.role = workersRoles();
	System.out.println("Podaj pensję pracownika:");
	worker.salary = scan.nextFloat();
	worker.account = false;
	workersList.workersList.put(workerId, worker);
	
	
}
public void setSalary(Workers workersList) {
	Worker worker = new Worker();
	int opt;
	workersList(workersList);
	System.out.println("Proszę wybrać pracownika, któremu chcesz zmienić pensję:");
	opt = scan.nextInt();
	worker = workersList.workersList.get(opt);
	System.out.println("Podaj jaka ma być pensja tego pracownika (przecinek dla ułamków):");
	worker.salary = scan.nextFloat();
	workersList.workersList.replace(opt, worker);
	System.out.println("Pensja została zaktualizowana.");
}
public void deleteWorker(Workers workersList) {
	int opt;
	workersList(workersList);
	System.out.println("Proszę wybrać pracownika, którego chcesz usunąć:");
	opt = scan.nextInt();
	workersList.workersList.remove(opt);
	System.out.println("Pracownik usunięty.");
}
public void workersList(Workers workersList)
{
	workersList.workersList.forEach((key, worker) -> {
		System.out.println("Id pracownika: "+key+" Imie pracownika: " +worker.workerName+
		" Nazwisko Pracownika: "+worker.workerSurname+" Stanowisko pracownika: " +worker.role+" Pensja pracownika: "+worker.salary+"z�");
		
	});
}
public void functionsWorkers(Workers workers) {
	int opt;
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: addWorker(workers);break;
	case 2: setSalary(workers);break;
	case 3: deleteWorker(workers);break;
	case 4: workersList(workers);break;
	default: System.out.println("Wyj�cie");break;
	}
}
@Override
public void operationsList() {
	System.out.println("1.Dodaj pracownika.");
	System.out.println("2.Zmień pensję pracownika.");
	System.out.println("3.Usuń pracownika.");
	System.out.println("4.Wyświetl pracowników.");
}

}
