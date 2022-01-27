package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Office implements Menus{
	Scanner scan = new Scanner(System.in);
	Map <Integer,Raport> raportsList = new HashMap<Integer,Raport>();
	Map <Integer,Document> documentsList = new HashMap<Integer,Document>();
	
	public void addRaport() {
		Raport raport = new Raport();
		int raportId;
		System.out.println("Tworzenie raportu:");
		System.out.println("Podaj id raportu:");
		raportId = scan.nextInt();
		while(true) {
		if(raportsList.containsKey(raportId)) {
			System.out.println("Raport o podanym ID ju¿ istnieje, prosze podaæ inne ID.");
			raportId = scan.nextInt();
		}
		else {
		System.out.println("Podaj nazwe raportu:");
		raport.raportName = scan.next();
		scan.nextLine();
		System.out.println("Podaj treœæ raportu:");
		raport.raportData = scan.nextLine();
		System.out.println("Raport zosta³ utworzony.");
		raportsList.put(raportId,raport); break;
		}
		}
	}
	public void removeRaport()
	{
		raportsList();
		int key;
		System.out.println("Raport o jakim ID chcesz usun¹æ?");
		key = scan.nextInt();
		raportsList.remove(key);
	}
	public void updateRaportName(int key)
	{
		String newName;
		System.out.println("Podaj now¹ nazwê:");
		newName = scan.next();
		Raport raport = new Raport();
		raport = raportsList.get(key);
		raport.raportName = newName; 
	}
	public void updateRaportData(int key)
	{
		String newData;
		System.out.println("Podaj nowe dane do raportu:");
		newData = scan.next();
		Raport raport = new Raport();
		raport = raportsList.get(key);
		raport.raportData = newData; 
	}
	public void editRaport()
	{
		int key,opt;
		System.out.println("Podaj ID raportu, który chcesz edytowaæ:");
		key = scan.nextInt();
		System.out.println("Który parametr chcesz edytowaæ:");
		System.out.println("1.Nazwê.");
		System.out.println("2.Zawartoœæ.");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: updateRaportName(key);break;
		case 2: updateRaportData(key);break;
		default: System.out.println("Podano nieprawid³ow¹ opcjê.");
		}
		
	}
	public void raportsList()
	{

		raportsList.forEach((key, raport) -> {
			System.out.println(key + " = " + raport.raportName);
		});
	}
	public void raportShowData()
	{
		int key;
		raportsList();
		System.out.println("Podaj ID raportu, który chcesz przeczytaæ:");
		key = scan.nextInt();
		Raport raport = new Raport();
		raport = raportsList.get(key);
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
		default: System.out.println("Wybrano niepoprawn¹ operacjê");
		}
		return docType;
	}
	public void addDocument() {
		int documentId;
		Document document = new Document();
		System.out.println("Tworzenie dokumentu:");
		System.out.println("Podaj id dokumentu:");
		documentId = scan.nextInt();
		while(true) {
			if(documentsList.containsKey(documentId)) {
				System.out.println("Document o podanym ID ju¿ istnieje, prosze podaæ inne ID.");
				documentId = scan.nextInt();
			}
			else {
		document.documentType = documentType();
		System.out.println("Podaj nazwe dokumentu:");
		document.documentName = scan.next();
		scan.nextLine();
		System.out.println("Podaj treœæ dokumentu:");
		document.documentData = scan.nextLine();
		System.out.println("Dokument zosta³ utworzony.");
		documentsList.put(documentId,document);break;
			}
		}
	}
	public void removeDocument()
	{
		documentsList();
		int key;
		System.out.println("Document o jakim ID chcesz usun¹æ?");
		key = scan.nextInt();
		documentsList.remove(key);
	}
	public void updateDocumentName(int key)
	{
		String newName;
		System.out.println("Podaj now¹ nazwê:");
		newName = scan.next();
		Document document = new Document();
		document = documentsList.get(key);
		document.documentName = newName; 
	}
	public void updateDocumentData(int key)
	{
		String newData;
		System.out.println("Podaj nowe dane do raportu:");
		newData = scan.next();
		Document document = new Document();
		document = documentsList.get(key);
		document.documentData = newData; 
	}
	public void updateDocumentType(int key)
	{
		String newDocType;
		System.out.println("Podaj nowy typ dokumentu:");
		newDocType = documentType();
		Document document = new Document();
		document = documentsList.get(key);
		document.documentType = newDocType; 
	}
	public void editDocument()
	{
		int key,opt;
		System.out.println("Podaj ID documentu, który chcesz edytowaæ:");
		key = scan.nextInt();
		System.out.println("Który parametr chcesz edytowaæ:");
		System.out.println("1.Nazwê.");
		System.out.println("2.Zawartoœæ.");
		System.out.println("3.Typ.");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: updateDocumentName(key);break;
		case 2: updateDocumentData(key);break;
		case 3: updateDocumentType(key);break;
		default: System.out.println("Podano nieprawid³ow¹ opcjê.");
		}
		
	}
	public void documentsList()
	{

		documentsList.forEach((key, document) -> {
			System.out.println(key + " = " +document.documentType+" " +document.documentName);
		});
	}
	public void documentShowData()
	{
		int key;
		documentsList();
		System.out.println("Podaj ID dokumentu, który chcesz przeczytaæ:");
		key = scan.nextInt();
		Document document = new Document();
		document = documentsList.get(key);
			System.out.println(document.documentData);
	}
	@Override
	public void operationsList() {
		System.out.println("Co chcesz zrobiæ w biurze?");
		System.out.println("1.Dodaæ raport.");
		System.out.println("2.Edytowaæ raport.");
		System.out.println("3.Usun¹æ raport.");
		System.out.println("4.Dodaæ dokument.");
		System.out.println("5.Edytowaæ dokument.");
		System.out.println("6.Usun¹æ dokument.");
		System.out.println("7.Wyœwietl listê raportów.");
		System.out.println("8.Wyœwietl listê dokumentów.");
		System.out.println("9.Wyjœcie.");
	}
	public void selectOperation(){
		int opt;
		Boolean stat = true;
		while(stat) {
		operationsList();
		System.out.println("Wybierz operacjê:");
		opt = scan.nextInt();
		switch(opt)
		{
		case 1: addRaport();break;
		case 2: editRaport();break;
		case 3: removeRaport();break;
		case 4: addDocument();break;
		case 5: editDocument();break;
		case 6: removeDocument();break;
		case 7: raportsList();break;
		case 8: documentsList();break;
		case 9: stat = false;break;
		default: System.out.println("Wybrano niepoprawn¹ operacjê.");break;
		}
	}
	}
}
