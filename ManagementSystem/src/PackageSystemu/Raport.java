package PackageSystemu;

public class Raport
{
    private int RaportId;
    private String RaportName;
    private String RaportData;

    public Raport(int raportId, String raportName, String raportData) {
        RaportId = raportId;
        RaportName = raportName;
        RaportData = raportData;
    }

    public int getRaportId() {
        return RaportId;
    }

    public String getRaportName() {
        return RaportName;
    }

    public String getRaportData() {
        return RaportData;
    }

    public void setRaportId(int raportId) {
        RaportId = raportId;
    }

    public void setRaportName(String raportName) {
        RaportName = raportName;
    }

    public void setRaportData(String raportData) {
        RaportData = raportData;
    }
}