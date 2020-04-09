package petshop;
import java.util.*; 

import java.io.*; 
import java.lang.*; 
class Sortbyroll implements Comparator<Employee> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Employee a, Employee b) 
    { 
        int l1 = a.GetName().length(); 
        int l2 = b.GetName().length(); 
        int lmin = Math.min(l1, l2); 
  
        for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)a.GetName().charAt(i); 
            int str2_ch = (int)a.GetName().charAt(i); 
  
            if (str1_ch != str2_ch) { 
                return str1_ch - str2_ch; 
            } 
        } 
  
        // Edge case for strings like 
        // String 1="Geeks" and String 2="Geeksforgeeks" 
        if (l1 != l2) { 
            return l1 - l2; 
        } 
  
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
            return 0; 
        } 
    } 
} 

public class Service {
    List<Employee> e = new ArrayList<Employee>(); 
	public void Request (int i)
	{
		Scanner scanner = new Scanner(System. in);
		if(i == 1) {
			System.out.println("Introduceti numele noului angajat:");
			
	        String inputString = scanner.nextLine();
	        System.out.println("Introduceti functia noului angajat(1-ZooKeeper, 2-Vet, 3-AuxiliaryEmployee):");
	        int job = scanner.nextInt();
	        System.out.println("Introduceti varsta noului angajat:");
	        int age = scanner.nextInt();
	        if(job == 1) {
	        	ZooKeeper a = new ZooKeeper(inputString, age, 0);
	        	e.add(a);
	        	//e.get(0).Info(); 
	        }
	        if(job == 2) {
	        	Vet a = new Vet(inputString, age);
	        	e.add(a);
	        	//e.get(0).Info(); 
	        }
	        if(job == 3) {
	        	AuxiliaryEmployees a = new AuxiliaryEmployees(inputString, age);
	        	e.add(a);
	        	//e.get(0).Info(); 
	        }
	        Collections.sort(e, new Sortbyroll()); 
		}else if(i == 5) {
            for(int j=0; j<e.size();j++)  
            {  
            	e.get(j).Info();     
            }  
        }else if(i == 2) {
        	System.out.println("Introduceti numele angajatului pe care il cautati:");
        	String inputName = scanner.nextLine();
            for(int j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			e.get(j).DetInfo(); 
            			break;
            		}
            	}
            }
         
        }else if(i == 9) {
        	System.out.println("Introduceti numele angajatului in grija caruia vreti sa adaugati un animal:");
        	String inputName = scanner.nextLine();
        	int j;
            for( j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            System.out.println("Introduceti ce fel de animal(Monkey, Parrot, Lion) vreti sa adaugati in grija angajatului:");
        	String inputAnimal = scanner.nextLine();
        	if(inputAnimal.contentEquals("Monkey"))
        	{
        		System.out.println("Introduceti numele maimutei: ");
        		String inputNameA = scanner.nextLine();
        		System.out.println("Introduceti varsta: ");
        		int ageA = scanner.nextInt();
        		Animal an = new Monkey(inputNameA,ageA,"banana");
        		e.get(j).AddAnimal(an);
        	}
        	if(inputAnimal.contentEquals("Parrot"))
        	{
        		System.out.println("Introduceti numele papagalului: ");
        		String inputNameA = scanner.nextLine();
        		System.out.println("Introduceti varsta: ");
        		int ageA = scanner.nextInt();
        		Animal an = new Parrot(inputNameA,ageA,"seminte");
        		e.get(j).AddAnimal(an);
        	}
        	if(inputAnimal.contentEquals("Lion"))
        	{
        		System.out.println("Introduceti numele leului: ");
        		String inputNameA = scanner.nextLine();
        		System.out.println("Introduceti varsta: ");
        		int ageA = scanner.nextInt();
        		Animal an = new Lion(inputNameA,ageA,"carne");
        		e.get(j).AddAnimal(an);
        	}
        }if(i == 3) {
        	System.out.println("Introduceti numele angajatului ale carui animale vreti sa le afisati:");
        	String inputName = scanner.nextLine();
        	int j;
            for( j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            e.get(j).PrintAnimal(); 
        }if(i == 4) {
        	System.out.println("Introduceti numele angajatului pe care vreti sa-l concediati:");
           	int j;
        	String inputName = scanner.nextLine();
            for( j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            e.remove(j);
        }if(i == 6) {
            for(int j=0; j<e.size();j++)  
            {  
            	System.out.println("Nume: " + e.get(j).GetName());
            	System.out.println("Salariu: " + e.get(j).SalaryCalculator());
            }
        }if(i == 7) {
        	System.out.println("Introduceti numele angajatului de la care vreti sa mutati animalul: ");
        	String inputName1 = scanner.nextLine();
        	System.out.println("Introduceti numele angajatului la care vreti sa mutati animalul: ");
        	String inputName2 = scanner.nextLine();
        	int j,k;
            for(j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName1)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
        	
            for(k=0; k<e.size();k++)  
            {  
            	if((e.get(k).GetName()).equals(inputName2)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            System.out.println("Introduceti numele animalului ce trebuie mutat: ");
            String AName = scanner.nextLine();

            String food = e.get(j).RetFood(AName);
            int age = e.get(j).RetAge(AName);
            if(food.equals("banana"))
            {
        		Animal an = new Monkey(AName,age,"banana");
        		e.get(k).AddAnimal(an);
            }else if(food.equals("seminte")){
        		Animal an = new Parrot(AName,age,"seminte");
        		e.get(k).AddAnimal(an);
            }else {
            	Animal an = new Lion(AName,age,"carne");
        		e.get(k).AddAnimal(an);
            }
            e.get(j).DeleteAnimal(AName);
           
            
        }if(i == 8) {
        	System.out.println("Introduceti numele angajatului de la care vreti stergeti animalul: ");
        	String inputName = scanner.nextLine();
        	int j;
            for(j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            System.out.println("Introduceti numele animalului pe care vreti sa-l stergeti: ");
        	String AName = scanner.nextLine();
        	e.get(j).DeleteAnimal(AName);
            
        }if(i == 10) {
        	System.out.println("Introduceti numele angajatului cu ale carui animale vreti sa interactionati: ");
        	String inputName = scanner.nextLine();
        	int j;
            for(j=0; j<e.size();j++)  
            {  
            	if((e.get(j).GetName()).equals(inputName)) {
            		{
            			//e.get(j).Info(); 
            			break;
            		}
            	}
            }
            e.get(j).Interact();
        }
	}
}
