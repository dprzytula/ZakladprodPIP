package PackageSystemu;
import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PracownikLP extends Pracownicy implements forms {
	Scanner scan = new Scanner(System.in);
	int selcity;
	int selodd;
	int FuncListPracLP() {
		System.out.println("Co chcesz zrobic?");
				System.out.println("1. Utworz raport o maszynie.");
				System.out.println("2. Sprawdz stan materia³u na magazynie.");
				System.out.println("3. Sprawdz co wyprodukowac.");
				return scan.nextInt();
	}
	void FunkPracownikLP() {
		selcity = SelectZakl();
		 selodd = ListOdd(selcity);
		if(LogPracownik(selcity,selodd)==1) 
		{
		switch(FuncListPracLP())
		{
		case 1: FormRep();break;
		}
		}
	}	
	
	
	public void FormRep() {
		System.out.println("Wypelnianie form");
		String name,nazwa;
		nazwa = scan.next();
		//int n = new File("C:\\Users\\dando\\eclipse-workspace\\ManagementSystem\\reports").list().length;
		String raport = "nowy raport o maszynce";
		name = nazwa+".txt";
		
		File file = new File("C:\\Users\\dando\\eclipse-workspace\\ManagementSystem\\reports/"+name);
        if(!file.exists()) {
            try {
				file.createNewFile();
				byte[] strToBytes = raport.getBytes();
				Files.write(Paths.get("C:\\\\ManagementSystem\\\\reports\\"+name), strToBytes);
			} catch (IOException e) {
			}   
        }
        else System.out.println("Taki raport juz istnieje");
	}
}
