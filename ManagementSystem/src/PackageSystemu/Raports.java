package PackageSystemu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Raports implements RaportFunctions
{
    Map<Integer, Raport> raportList = new HashMap<>();
    public void createRaport()
    {
        Scanner scan = new Scanner(System.in);
        int raportId = Integer.parseInt (scan.nextLine());
        String raportName = scan.nextLine();
        String raportData = scan.nextLine();;
        Raport r1 = new Raport(raportId, raportName, raportData);
    }
    public void raportList()
    {
        for (Map.Entry<Integer, Raport> entry : raportList.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " Raport name = " + entry.getValue().getRaportName());
        }

    }
    public void raportDelete(int raportId)
    {

    }

}
