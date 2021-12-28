package PackageSystemu;

import java.util.Scanner;

public class Zaklady implements zakladyData {

	Scanner n = new Scanner(System.in);
	 int SelectZakl() {
		
		int a=0;
		System.out.println("Lista miast z oddzialami:");
		for(int i = 0;i<cities.length;i++)
			System.out.println((i+1)+"."+cities[i]);
		System.out.println("Prosze wybrac miasto:");
		a = n.nextInt();
	return a-1;
	 }
	
	int ListOdd(int city) {
		int a=0;
		System.out.println("Lista oddzialów w mieœcie "+cities[city]+":");
		for(int i = 0;i<odds[city].length;i++)
			System.out.println((i+1)+"."+odds[city][i]);
		System.out.println("Prosze wybrac oddzia³:");
		a = n.nextInt();
		return a-1;
	}
	
}
