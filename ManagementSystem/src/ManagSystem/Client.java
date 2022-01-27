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
	System.out.println("Podaj id cz�ci, kt�r� chcesz zam�wi�:");
	order.partId = scan.nextInt();
	System.out.println("Podaj ilo�� cz�ci, kt�r� chcesz zam�wi�:");
	order.partAmount = scan.nextInt();
	ordersList.put(counter, order);
	System.out.println("Czy chcesz doda� kolejn� cz�� do zam�wienia?");
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
	System.out.println("Lista cz�ci w zam�wieniu:");
	ordersList.forEach((key, order) -> {
		System.out.println(key + " = " + order.partId +" "+order.partAmount);
	});
}
}
