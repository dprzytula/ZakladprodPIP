package PackageSystemu;

import java.util.HashMap;
import java.util.Map;

public class Raports
{
    Map<Integer, Raport> raportList = new HashMap<>();
    void createRaport(int raportId, String raportName, String raportData)
    {
        Raport rp = new Raport(raportId, raportName, raportData);
        raportList.put(raportId, rp);
    }
    void raportList()
    {
        for (Map.Entry<Integer, Raport> entry : raportList.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " Raport name = " + entry.getValue().getRaportName());
        }

    }
    void raportDelete(){}

}
