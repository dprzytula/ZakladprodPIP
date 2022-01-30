package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
	Storage stor = new Storage();
	Scanner scan = new Scanner(System.in);
	int counter;
	Map<Integer,Client> clientsList = new HashMap<Integer,Client>();
	
	public void createOrder()
	{
		Client client = new Client();
		counter = clientsList.size()+1;
		System.out.println("Prosze podac imie:");
		client.clientName = scan.next();
		System.out.println("Prosze podac nazwisko:");
		client.clientSurname = scan.next();
		client.addPartToOrder();
		client.orderStatus = false;
		clientsList.put(counter, client);
	}
	public void ordersList()
	{
		System.out.println("Lista zamowien:");
		clientsList.forEach((key, client) -> {
			System.out.println(key + " = " + client.clientName +" "+client.clientSurname);
			client.ordersList.forEach((key2, order) -> {
			System.out.println(key2 + " = " + order.partId +" "+order.partAmount);
			});
			if(client.orderStatus==false) System.out.println("Zamowienie czeka na realizacje.");
			else System.out.println("Zamowienie zrealizowane.");
		});
	}
	public void realizeOrder()
	{
		Client client = new Client();
		int orderId;
		System.out.println("Podaj ID zamowienia do zrealizowania:");
		orderId = scan.nextInt();
		client =  clientsList.get(orderId);
		client.orderStatus = true;
		System.out.println("Zamowienie zostalo zrealizowane.");
	}
}
