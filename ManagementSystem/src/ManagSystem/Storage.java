package ManagSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage implements Menus {
	
	Scanner scan = new Scanner(System.in);
Map <Integer,Part> partsList = new HashMap<Integer,Part>();
Map <Integer,Material> materialsList = new HashMap<Integer,Material>();

public void addPart(Storage storage) {
	Part part = new Part();
	System.out.println("Dodawanie czesci");
	System.out.println("Podaj id czesci");
	int partId = scan.nextInt();
	System.out.println("Podaj nazwe czesci");
	part.namePart = scan.next();
	System.out.println("Podaj iloæ czesci");
	part.amountPart = scan.nextInt();
	System.out.println("Czesc zostala dodana.");
	storage.partsList.put(partId,part);
}
public void removePart(Storage storage)
{
	int key;
	System.out.println("Czêæ o jakim ID chcesz usun¹æ?");
	key = scan.nextInt();
	storage.partsList.remove(key);
}
public void updatePartName(int key,Storage storage)
{
	String newName;
	System.out.println("Podaj now¹ nazwê:");
	newName = scan.next();
	Part parte = new Part();
	parte = storage.partsList.get(key);
	parte.namePart = newName; 
	storage.partsList.replace(key, parte);
}
public void updatePartAmount(int key,Storage storage)
{
	int newAmount;
	System.out.println("Podaj now¹ iloæ");
	newAmount = scan.nextInt();
	Part parte = new Part();
	parte = storage.partsList.get(key);
	parte.amountPart = newAmount; 
	storage.partsList.replace(key, parte);
}
public void editPart(Storage storage)
{
	int key,opt;
	System.out.println("Podaj ID czêci, któr¹ chcesz edytowaæ:");
	key = scan.nextInt();
	System.out.println("Który parametr chcesz edytowaæ:");
	System.out.println("1.Nazwê.");
	System.out.println("2.Iloæ.");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: updatePartName(key,storage);break;
	case 2: updatePartAmount(key,storage);break;
	}
	
}
public void partsList(Storage storage)
{

	storage.partsList.forEach((key, part) -> {
		System.out.println(key + " = " + part.namePart + " " + part.amountPart);
	});
}
public void addMaterial(Storage storage) {
	Material material = new Material();
	System.out.println("Dodawanie materia³u");
	System.out.println("Podaj id materia³u");
	int materialId = scan.nextInt();
	System.out.println("Podaj nazwe materia³u");
	material.nameMaterial = scan.next();
	System.out.println("Podaj iloæ materia³u");
	material.amountMaterial = scan.nextInt();
	System.out.println("Materia³ zosta³ dodany.");
	storage.materialsList.put(materialId,material);
}
public void removeMaterial(Storage storage)
{
	int key;
	System.out.println("Materia³ o jakim ID chcesz usun¹æ?");
	key = scan.nextInt();
	storage.materialsList.remove(key);
}
public void updateMaterialName(int key,Storage storage)
{
	String newName;
	System.out.println("Podaj now¹ nazwê:");
	newName = scan.next();
	Material material = new Material();
	material = materialsList.get(key);
	material.nameMaterial = newName; 
	storage.materialsList.replace(key, material);
}
public void updateMaterialAmount(int key,Storage storage)
{
	int newAmount;
	System.out.println("Podaj now¹ iloæ");
	newAmount = scan.nextInt();
	Material material = new Material();
	material = materialsList.get(key);
	material.amountMaterial = newAmount; 
	storage.materialsList.replace(key, material);
}
public void editMaterial(Storage storage)
{
	int key,opt;
	System.out.println("Podaj ID materia³u, któr¹ chcesz edytowaæ:");
	key = scan.nextInt();
	System.out.println("Który parametr chcesz edytowaæ:");
	System.out.println("1.Nazwê.");
	System.out.println("2.Iloæ.");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: updateMaterialName(key,storage);break;
	case 2: updateMaterialAmount(key,storage);break;
	}
	
}
public void materialsList(Storage storage)
{

	storage.materialsList.forEach((key, material) -> {
		System.out.println(key + " = " + material.nameMaterial + " " + material.amountMaterial);
	});
}
@Override
public void operationsList() {
	System.out.println("Co chcesz zrobiæ w magazynie?");
	System.out.println("1.Dodać część.");
	System.out.println("2.Edytowaæ część.");
	System.out.println("3.Usun¹æ część.");
	System.out.println("4.Dodaæ materia³.");
	System.out.println("5.Edytowaæ materia³.");
	System.out.println("6.Usun¹æ materia³.");
	System.out.println("7.Wywietl listê czêci w magazynie.");
	System.out.println("8.Wywietl listê materia³ów w magazynie.");
	System.out.println("9.Wyjcie.");
}
public void selectOperation(Storage storage){
	int opt;
	Boolean stat = true;
	while(stat == true) {
	operationsList();
	System.out.println("Wybierz operacjê:");
	opt = scan.nextInt();
	switch(opt)
	{
	case 1: addPart(storage);break;
	case 2: editPart(storage);break;
	case 3: removePart(storage);break;
	case 4: addMaterial(storage);break;
	case 5: editMaterial(storage);break;
	case 6: removeMaterial(storage);break;
	case 7: partsList(storage);break;
	case 8: materialsList(storage);break;
	case 9: stat = false;break;
	default: System.out.println("Wybrano niepoprawn¹ operacjê.");break;
	}
}
}
}

