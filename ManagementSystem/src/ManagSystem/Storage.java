package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage implements Menus {
	
	Scanner scan = new Scanner(System.in);
Map <Integer,Part> partsList = new HashMap<Integer,Part>();
Map <Integer,Material> materialsList = new HashMap<Integer,Material>();

public void addPart() {
	Part part = new Part();
	System.out.println("Dodawanie czêœci");
	System.out.println("Podaj id czêœci");
	int partId = scan.nextInt();
	System.out.println("Podaj nazwe czêœci");
	part.namePart = scan.next();
	System.out.println("Podaj iloœæ czêœci");
	part.amountPart = scan.nextInt();
	System.out.println("Czêœæ zosta³a dodana.");
	partsList.put(partId,part);
}
public void removePart()
{
	int key;
	System.out.println("Czêœæ o jakim ID chcesz usun¹æ?");
	key = scan.nextInt();
	partsList.remove(key);
}
public void updatePartName(int key)
{
	String newName;
	System.out.println("Podaj now¹ nazwê:");
	newName = scan.next();
	Part parte = new Part();
	parte = partsList.get(key);
	parte.namePart = newName; 
}
public void updatePartAmount(int key)
{
	int newAmount;
	System.out.println("Podaj now¹ iloœæ");
	newAmount = scan.nextInt();
	Part parte = new Part();
	parte = partsList.get(key);
	parte.amountPart = newAmount; 
}
public void editPart()
{
	int key,opt;
	System.out.println("Podaj ID czêœci, któr¹ chcesz edytowaæ:");
	key = scan.nextInt();
	System.out.println("Który parametr chcesz edytowaæ:");
	System.out.println("1.Nazwê.");
	System.out.println("2.Iloœæ.");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: updatePartName(key);break;
	case 2: updatePartAmount(key);break;
	}
	
}
public void partsList()
{

	partsList.forEach((key, part) -> {
		System.out.println(key + " = " + part.namePart + " " + part.amountPart);
	});
}
public void addMaterial() {
	Material material = new Material();
	System.out.println("Dodawanie materia³u");
	System.out.println("Podaj id materia³u");
	int materialId = scan.nextInt();
	System.out.println("Podaj nazwe materia³u");
	material.nameMaterial = scan.next();
	System.out.println("Podaj iloœæ materia³u");
	material.amountMaterial = scan.nextInt();
	System.out.println("Materia³ zosta³ dodany.");
	materialsList.put(materialId,material);
}
public void removeMaterial()
{
	int key;
	System.out.println("Materia³ o jakim ID chcesz usun¹æ?");
	key = scan.nextInt();
	materialsList.remove(key);
}
public void updateMaterialName(int key)
{
	String newName;
	System.out.println("Podaj now¹ nazwê:");
	newName = scan.next();
	Material material = new Material();
	material = materialsList.get(key);
	material.nameMaterial = newName; 
}
public void updateMaterialAmount(int key)
{
	int newAmount;
	System.out.println("Podaj now¹ iloœæ");
	newAmount = scan.nextInt();
	Material material = new Material();
	material = materialsList.get(key);
	material.amountMaterial = newAmount; 
}
public void editMaterial()
{
	int key,opt;
	System.out.println("Podaj ID materia³u, któr¹ chcesz edytowaæ:");
	key = scan.nextInt();
	System.out.println("Który parametr chcesz edytowaæ:");
	System.out.println("1.Nazwê.");
	System.out.println("2.Iloœæ.");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: updateMaterialName(key);break;
	case 2: updateMaterialAmount(key);break;
	}
	
}
public void materialsList()
{

	materialsList.forEach((key, material) -> {
		System.out.println(key + " = " + material.nameMaterial + " " + material.amountMaterial);
	});
}
@Override
public void operationsList() {
	System.out.println("Co chcesz zrobiæ w magazynie?");
	System.out.println("1.Dodaæ czêœæ.");
	System.out.println("2.Edytowaæ czêœæ.");
	System.out.println("3.Usun¹æ czêœæ.");
	System.out.println("4.Dodaæ materia³.");
	System.out.println("5.Edytowaæ materia³.");
	System.out.println("6.Usun¹æ materia³.");
	System.out.println("7.Wyœwietl listê czêœci w magazynie.");
	System.out.println("8.Wyœwietl listê materia³ów w magazynie.");
	System.out.println("9.Wyjœcie.");
}
public void selectOperation(){
	int opt;
	Boolean stat = true;
	while(stat == true) {
	operationsList();
	System.out.println("Wybierz operacjê:");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: addPart();break;
	case 2: editPart();break;
	case 3: removePart();break;
	case 4: addMaterial();break;
	case 5: editMaterial();break;
	case 6: removeMaterial();break;
	case 7: partsList();break;
	case 8: materialsList();break;
	case 9: stat = false;break;
	default: System.out.println("Wybrano niepoprawn¹ operacjê.");break;
	}
}
}
}
