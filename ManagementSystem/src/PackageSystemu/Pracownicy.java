package PackageSystemu;

import java.util.Scanner;

public class Pracownicy extends Zaklady implements LoginInterface,loginData {
	Scanner scan = new Scanner(System.in);
	String login="",haslo="";
	public Boolean Login(int city,int odd)
	{
		Boolean test = false;
		
		System.out.println("Podaj dane logowania:");
		System.out.println("Podaj login:");
		login = scan.nextLine();
		System.out.println("Podaj haslo:");
		haslo = scan.nextLine();
		
		for(int i = 0;i<accounts[city][odd].length;i++)
		{
			if(login.compareTo(accounts[city][odd][i][0])==0 && haslo.compareTo(accounts[city][odd][i][1])==0 && accounts[city][odd][i][2].contains("Pracownik")) { test = true;
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
	
		
		String PracownikLogin() {
			String role ="";
			int selcity = SelectZakl();
			int selodd = ListOdd(selcity);
			if(LogPracownik(selcity,selodd)==1) 
			{
				for(int i = 0;i<accounts[selcity][selodd].length;i++)
				{
				if(login.compareTo(accounts[selcity][selodd][i][0])==0 && haslo.compareTo(accounts[selcity][selodd][i][1])==0)
				{
				 role = 	accounts[selcity][selodd][i][2];
				}
				}
			}
			
			return role;
		}
		
		
		
}
