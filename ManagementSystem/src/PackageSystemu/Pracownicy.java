package PackageSystemu;

import java.util.Scanner;

public class Pracownicy extends Zaklady implements LoginInterface,loginData {
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
			if(login.compareTo(accounts[city][odd][i][0])==0 && haslo.compareTo(accounts[city][odd][i][1])==0 && "Pracownik".compareTo(accounts[city][odd][i][2])==0) { test = true;
			break;
			}
		}
		return test;
	}	
	
		int LogPracownik(int selcity,int selodd)
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
	
}
