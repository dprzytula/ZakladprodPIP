package PackageSystemu;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wlasciciel extends Zaklady implements loginData,forms {
	int selcity;
	int selodd;
	void FunkWlasc() {
		int selcity = SelectZakl();
		int selodd = ListOdd(selcity);
		if(LogWlasc(selcity,selodd)==1) 
		{
		//menu_wlasciciela();
		}
	}
	void MenuWlasciciela()
	{

		System.out.println("Co chcesz zrobic?");
		//wlasciciel
				System.out.println("1. Zarzadzaj pracownikami.");
				System.out.println("2. Zarzadzaj firm¹.");
	}
	Scanner scan = new Scanner(System.in);
	
	public Boolean Login(int city,int odd)
	{
		Boolean test = false;
		String login="",haslo="";
		System.out.println("Podaj dane logowania:");
		System.out.println("Podaj login:");
		login = scan.nextLine();
		System.out.println("Podaj haslo:");
		haslo = scan.nextLine();
		
		for(int i = 0;i<accounts[city][odd].length;i++)
		{
			if(login.compareTo(accounts[city][odd][i][0])==0 && haslo.compareTo(accounts[city][odd][i][1])==0 && "Wlasciciel".compareTo(accounts[city][odd][i][2])==0) { test = true;
			break;
			}
		}
		return test;
	}	
	
		int LogWlasc(int selcity,int selodd)
		{
			int var;
			if(Login(selcity,selodd)) 
				{
				System.out.println("Zalogowano");
				var = 1;
				}
			else 
				{
				System.out.println("Podano nieprawidlowe dane");
				var = 0;
				}
			return var;
		}
		public void CreateRaport() {
			
		}
		@Override
		public void RaportsList() {
			
	        String[] pathnames;

	        File f = new File("C:\\Users\\dando\\Desktop\\ZakladprodPIP\\ManagementSystem\\reports");

	        
	        pathnames = f.list();

	        for (String pathname : pathnames) {
	            System.out.println(pathname);
	        }
			
		}
		@Override
		public void RaportDelete() {
			// TODO Auto-generated method stub
			
		}
}
