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
	System.out.println("Dodawanie cz�ci");
	System.out.println("Podaj id cz�ci");
	int partId = scan.nextInt();
	System.out.println("Podaj nazwe cz�ci");
	part.namePart = scan.next();
	System.out.println("Podaj ilo�� cz�ci");
	part.amountPart = scan.nextInt();
	System.out.println("Cz�� zosta�a dodana.");
	partsList.put(partId,part);
}
public void removePart()
{
	int key;
	System.out.println("Cz�� o jakim ID chcesz usun��?");
	key = scan.nextInt();
	partsList.remove(key);
}
public void updatePartName(int key)
{
	String newName;
	System.out.println("Podaj now� nazw�:");
	newName = scan.next();
	Part parte = new Part();
	parte = partsList.get(key);
	parte.namePart = newName; 
}
public void updatePartAmount(int key)
{
	int newAmount;
	System.out.println("Podaj now� ilo��");
	newAmount = scan.nextInt();
	Part parte = new Part();
	parte = partsList.get(key);
	parte.amountPart = newAmount; 
}
public void editPart()
{
	int key,opt;
	System.out.println("Podaj ID cz�ci, kt�r� chcesz edytowa�:");
	key = scan.nextInt();
	System.out.println("Kt�ry parametr chcesz edytowa�:");
	System.out.println("1.Nazw�.");
	System.out.println("2.Ilo��.");
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
	System.out.println("Dodawanie materia�u");
	System.out.println("Podaj id materia�u");
	int materialId = scan.nextInt();
	System.out.println("Podaj nazwe materia�u");
	material.nameMaterial = scan.next();
	System.out.println("Podaj ilo�� materia�u");
	material.amountMaterial = scan.nextInt();
	System.out.println("Materia� zosta� dodany.");
	materialsList.put(materialId,material);
}
public void removeMaterial()
{
	int key;
	System.out.println("Materia� o jakim ID chcesz usun��?");
	key = scan.nextInt();
	materialsList.remove(key);
}
public void updateMaterialName(int key)
{
	String newName;
	System.out.println("Podaj now� nazw�:");
	newName = scan.next();
	Material material = new Material();
	material = materialsList.get(key);
	material.nameMaterial = newName; 
}
public void updateMaterialAmount(int key)
{
	int newAmount;
	System.out.println("Podaj now� ilo��");
	newAmount = scan.nextInt();
	Material material = new Material();
	material = materialsList.get(key);
	material.amountMaterial = newAmount; 
}
public void editMaterial()
{
	int key,opt;
	System.out.println("Podaj ID materia�u, kt�r� chcesz edytowa�:");
	key = scan.nextInt();
	System.out.println("Kt�ry parametr chcesz edytowa�:");
	System.out.println("1.Nazw�.");
	System.out.println("2.Ilo��.");
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
	System.out.println("Co chcesz zrobi� w magazynie?");
	System.out.println("1.Doda� cz��.");
	System.out.println("2.Edytowa� cz��.");
	System.out.println("3.Usun�� cz��.");
	System.out.println("4.Doda� materia�.");
	System.out.println("5.Edytowa� materia�.");
	System.out.println("6.Usun�� materia�.");
	System.out.println("7.Wy�wietl list� cz�ci w magazynie.");
	System.out.println("8.Wy�wietl list� materia��w w magazynie.");
	System.out.println("9.Wyj�cie.");
}
public void selectOperation(){
	int opt;
	Boolean stat = true;
	while(stat == true) {
	operationsList();
	System.out.println("Wybierz operacj�:");
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
	default: System.out.println("Wybrano niepoprawn� operacj�.");break;
	}
}
}
}
