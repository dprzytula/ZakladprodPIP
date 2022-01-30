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
public Map<Integer,Order> ordersList = new HashMap<Integer,Order>();
 
public void addPartToOrder()
{
	Boolean stat = true;
	int opt;
	counter = ordersList.size()+1;
	while(stat == true) {
	Order order = new Order();
	System.out.println("Podaj id czesci, ktora chcesz zamowic:");
	order.partId = scan.nextInt();
	System.out.println("Podaj ilosc czesci, ktora chcesz zamowic:");
	order.partAmount = scan.nextInt();
	ordersList.put(counter, order);
	System.out.println("Czy chcesz dodac kolejna czesc do zamowienia?");
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
	System.out.println("Lista czesci w zamowieniu:");
	ordersList.forEach((key, order) -> {
		System.out.println(key + " = " + order.partId +" "+order.partAmount);
	});
}
}
