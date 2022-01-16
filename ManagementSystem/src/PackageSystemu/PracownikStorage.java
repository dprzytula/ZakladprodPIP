package PackageSystemu;

public class PracownikStorage implements forms,StorageFunctions,Parts,PartsStorage{

	
	public void RaportsList() {
		
	}
	public void CreateRaport() {
		
	}
	public void addPart() {
		
	}
	
	public void deletePart() {
		
	}
	
	@Override
	public void PartsList() {
		for(int i = 0;i<parts.length;i++)
		{
			System.out.println(parts[i]);	
		}
		
	}
	
	void PracownikStgMenu()
	{
		int a =1;
		if(a==1) PartsList();
	}
	@Override
	public void RaportDelete() {
		// TODO Auto-generated method stub
		
	}
	
}
