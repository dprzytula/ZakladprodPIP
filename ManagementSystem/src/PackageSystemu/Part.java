package PackageSystemu;

public class Part {
    private int PartId;
    private String PartName;
    private String PartCarModel;
    private int PartAmount;

    public Part(int partId, String partName, String partCarModel, int partAmount) {
        PartId = partId;
        PartName = partName;
        PartCarModel = partCarModel;
        PartAmount = partAmount;
    }

    public int getPartId() {
        return PartId;
    }

    public void setPartId(int partId) {
        PartId = partId;
    }

    public String getPartName() {
        return PartName;
    }

    public void setPartName(String partName) {
        PartName = partName;
    }

    public String getPartCarModel() {
        return PartCarModel;
    }

    public void setPartCarModel(String partCarModel) {
        PartCarModel = partCarModel;
    }

    public int getPartAmount() {
        return PartAmount;
    }

    public void setPartAmount(int partAmount) {
        PartAmount = partAmount;
    }
}
