package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
	Scanner scan = new Scanner(System.in);
String clientName;
String clientSurname;
int counter;
Boolean orderStatus;
Map<Integer,Order> ordersList = new HashMap<Integer,Order>();
 
public void addPartToOrder()
{
	Boolean stat = true;
	int opt;
	counter = ordersList.size()+1;
	while(stat == true) {
	Order order = new Order();
	System.out.println("Podaj id czêœci, któr¹ chcesz zamówiæ:");
	order.partId = scan.nextInt();
	System.out.println("Podaj iloœæ czêœci, któr¹ chcesz zamówiæ:");
	order.partAmount = scan.nextInt();
	ordersList.put(counter, order);
	System.out.println("Czy chcesz dodaæ kolejn¹ czêœæ do zamówienia?");
	System.out.println("1.Tak.");
	System.out.println("Inny.Nie, to wszystko.");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: addPartToOrder();
	default: stat = false;
	}
	}
}

public void ordersList()
{
	System.out.println("Lista czêœci w zamówieniu:");
	ordersList.forEach((key, order) -> {
		System.out.println(key + " = " + order.partId +" "+order.partAmount);
	});
}
}
