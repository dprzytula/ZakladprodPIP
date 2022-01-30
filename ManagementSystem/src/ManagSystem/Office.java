package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Office implements Menus{
	Scanner scan = new Scanner(System.in);
	Map <Integer,Raport> raportsList = new HashMap<Integer,Raport>();
	Map <Integer,Document> documentsList = new HashMap<Integer,Document>();
	
	public void addRaport(Office office) {
		Raport raport = new Raport();
		int raportId;
		System.out.println("Tworzenie raportu:");
		System.out.println("Podaj id raportu:");
		raportId = scan.nextInt();
		while(true) {
		if(raportsList.containsKey(raportId)) {
			System.out.println("Raport o podanym ID juz istnieje, prosze podac inne ID.");
			raportId = scan.nextInt();
		}
		else {
		System.out.println("Podaj nazwe raportu:");
		raport.raportName = scan.next();
		scan.nextLine();
		System.out.println("Podaj tresc raportu:");
		raport.raportData = scan.nextLine();
		System.out.println("Raport zostal utworzony.");
		office.raportsList.put(raportId,raport); break;
		}
		}
	}
	public void removeRaport(Office office)
	{
		raportsList(office);
		int key;
		System.out.println("Raport o jakim ID chcesz usunac?");
		key = scan.nextInt();
		office.raportsList.remove(key);
	}
	public void updateRaportName(int key,Office office)
	{
		String newName;
		System.out.println("Podaj nowa nazwa:");
		newName = scan.next();
		Raport raport = new Raport();
		raport = office.raportsList.get(key);
		raport.raportName = newName; 
		office.raportsList.replace(key, raport);
	}
	public void updateRaportData(int key,Office office)
	{
		String newData;
		System.out.println("Podaj nowe dane do raportu:");
		newData = scan.next();
		Raport raport = new Raport();
		raport = office.raportsList.get(key);
		raport.raportData = newData; 
		office.raportsList.replace(key, raport);
	}
	public void editRaport(Office office)
	{
		int key,opt;
		System.out.println("Podaj ID raportu, ktory chcesz edytowac:");
		key = scan.nextInt();
		System.out.println("Ktory parametr chcesz edytowac:");
		System.out.println("1.Nazwa.");
		System.out.println("2.Zawartosc.");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: updateRaportName(key,office);break;
		case 2: updateRaportData(key,office);break;
		default: System.out.println("Podano nieprawidlowa opcje.");
		}
		
	}
	public void raportsList(Office office)
	{

		office.raportsList.forEach((key, raport) -> {
			System.out.println(key + " = " + raport.raportName);
		});
	}
	public void raportShowData(Office office)
	{
		int key;
		raportsList(office);
		System.out.println("Podaj ID raportu, ktory chcesz przeczytac:");
		key = scan.nextInt();
		Raport raport = new Raport();
		raport = office.raportsList.get(key);
			System.out.println(raport.raportData);
	}
	public String documentType()
	{
		int opt;
		String docType= "";
		System.out.println("Wybierz typ dokumentu:");
		System.out.println("1.Faktura.");
		System.out.println("2.Formularz.");
		System.out.println("3.Rachunek");
		System.out.println("4.Dokument dot. pracownika");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: docType="Faktura";break;
		case 2: docType="Formularz";break;
		case 3: docType="Rachunek";break;
		case 4: docType="Dokument dot. pracownika";break;
		default: System.out.println("Wybrano niepoprawna operacje");
		}
		return docType;
	}
	public void addDocument(Office office) {
		int documentId;
		Document document = new Document();
		System.out.println("Tworzenie dokumentu:");
		System.out.println("Podaj id dokumentu:");
		documentId = scan.nextInt();
		while(true) {
			if(documentsList.containsKey(documentId)) {
				System.out.println("Document o podanym ID juz istnieje, prosze podac inne ID.");
				documentId = scan.nextInt();
			}
			else {
		document.documentType = documentType();
		System.out.println("Podaj nazwe dokumentu:");
		document.documentName = scan.next();
		scan.nextLine();
		System.out.println("Podaj tresc dokumentu:");
		document.documentData = scan.nextLine();
		System.out.println("Dokument zostal utworzony.");
		office.documentsList.put(documentId,document);break;
			}
		}
	}
	public void removeDocument(Office office)
	{
		documentsList(office);
		int key;
		System.out.println("Document o jakim ID chcesz usunac?");
		key = scan.nextInt();
		office.documentsList.remove(key);
	}
	public void updateDocumentName(int key,Office office)
	{
		String newName;
		System.out.println("Podaj nowa nazwe:");
		newName = scan.next();
		Document document = new Document();
		document = office.documentsList.get(key);
		document.documentName = newName; 
		office.documentsList.replace(key, document);
	}
	public void updateDocumentData(int key,Office office)
	{
		String newData;
		System.out.println("Podaj nowe dane do raportu:");
		newData = scan.next();
		Document document = new Document();
		document = office.documentsList.get(key);
		document.documentData = newData; 
		office.documentsList.replace(key, document);
	}
	public void updateDocumentType(int key,Office office)
	{
		String newDocType;
		System.out.println("Podaj nowy typ dokumentu:");
		newDocType = documentType();
		Document document = new Document();
		document = office.documentsList.get(key);
		document.documentType = newDocType; 
		office.documentsList.replace(key, document);
	}
	public void editDocument(Office office)
	{
		int key,opt;
		System.out.println("Podaj ID documentu, ktory chcesz edytowac:");
		key = scan.nextInt();
		System.out.println("Ktory parametr chcesz edytowac:");
		System.out.println("1.Nazwa.");
		System.out.println("2.Zawartosc.");
		System.out.println("3.Typ.");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: updateDocumentName(key,office);break;
		case 2: updateDocumentData(key,office);break;
		case 3: updateDocumentType(key,office);break;
		default: System.out.println("Podano nieprawidlowa opcje.");
		}
		
	}
	public void documentsList(Office office)
	{

		office.documentsList.forEach((key, document) -> {
			System.out.println(key + " = " +document.documentType+" " +document.documentName);
		});
	}
	public void documentShowData(Office office)
	{
		int key;
		documentsList(office);
		System.out.println("Podaj ID dokumentu, ktory chcesz przeczytac:");
		key = scan.nextInt();
		Document document = new Document();
		document = office.documentsList.get(key);
			System.out.println(document.documentData);
	}
	@Override
	public void operationsList() {
		System.out.println("Co chcesz zrobic w biurze?");
		System.out.println("1.Dodac raport.");
		System.out.println("2.Edytowac raport.");
		System.out.println("3.Usunac raport.");
		System.out.println("4.Dodac dokument.");
		System.out.println("5.Edytowac dokument.");
		System.out.println("6.Usunac dokument.");
		System.out.println("7.Wyswietl liste raportow.");
		System.out.println("8.Wyswietl liste dokumentow.");
		System.out.println("9.Wyjscie.");
	}
	public void selectOperation(Office office){
		int opt;
		Boolean stat = true;
		while(stat) {
		operationsList();
		System.out.println("Wybierz operacje:");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: addRaport(office);break;
		case 2: editRaport(office);break;
		case 3: removeRaport(office);break;
		case 4: addDocument(office);break;
		case 5: editDocument(office);break;
		case 6: removeDocument(office);break;
		case 7: raportsList(office);break;
		case 8: documentsList(office);break;
		case 9: stat = false;break;
		default: System.out.println("Wybrano niepoprawna operacje.");break;
		}
	}
	}
	public void functionsOffice(Office office)
	{
		int opt;
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: addRaport(office);break;
		case 2: editRaport(office);break;
		case 3: removeRaport(office);break;
		case 4: addDocument(office);break;
		case 5: editDocument(office);break;
		case 6: removeDocument(office);break;
		case 7: raportsList(office);break;
		case 8: documentsList(office);break;
		default: System.out.println("Wybrano niepoprawna operacje.");break;
		}
	}
}
