package petshop;


import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Setup {
	//private static String filename = "Employees.csv";
	private static Setup single_instance = null; 
	
    private Setup() 
    { 
        //s = "Hello I am a string part of Singleton class"; 
    	System.out.println("Se incarca datele");
    } 
    public static Setup getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Setup(); 
  
        return single_instance; 
    } 
	public static void AddUserCSV(Service serv, String name) {
		String s = null;
		try {
			Scanner scan = new Scanner((new File(name)));
			s = scan.nextLine();
			//String[] info = s.split(";");
			while(scan.hasNext()){
				String n = scan.nextLine();
				String[] info = n.split(";");
				//System.out.println(info[0]);
				serv.addEmployee(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]));
			}
	    
		} catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	    }
		

	}
	public static void AddAnimalCSV(Service serv, String name1, String name2, String name3) {
		String s1 = null;
		String s2 = null;
		String s3 = null;
		try {
			Scanner scan1 = new Scanner((new File(name1)));
			s1 = scan1.nextLine();
			//String[] info = s.split(";");
			while(scan1.hasNext()){
				String n = scan1.nextLine();
				String[] info = n.split(";");
				//System.out.println(info[2]);
				serv.addAnimal(info[0],Integer.parseInt(info[1]),info[2],1);
			}
			Scanner scan2 = new Scanner((new File(name2)));
			s2 = scan2.nextLine();
			//String[] info = s.split(";");
			while(scan2.hasNext()){
				String n = scan2.nextLine();
				String[] info = n.split(";");
				//System.out.println(info[2]);
				serv.addAnimal(info[0],Integer.parseInt(info[1]),info[2],2);
			}
			Scanner scan3 = new Scanner((new File(name3)));
			s3 = scan3.nextLine();
			//String[] info = s.split(";");
			while(scan3.hasNext()){
				String n = scan3.nextLine();
				String[] info = n.split(";");
				//System.out.println(info[2]);
				serv.addAnimal(info[0],Integer.parseInt(info[1]),info[2],3);
			}
	    
		} catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	    }
	}
	public static void WriteCSV(Service serv)
	{
		List<Employee> e = serv.getList();
		int j = 0;
		String data =  "Numele angajatului ; Varsta angajatului ; Functia anagajatului ; Numarul de animale de care are grija angajatul\n";
		//System.out.println(e.get(j).SalaryCalculator());
		for (int i = 0; i < e.size(); i++) {
			data += e.get(i).GetName() + ";" + e.get(i).GetAge() + ";" +
                    e.get(i).GetJob() + ";" + e.get(i).GetNrAnimals() + "\n";
			//1-ZooKeeper, 2-Vet, 3-AuxiliaryEmployee
		}
        try {
           
            FileWriter writer = new FileWriter("angajati.csv");
            writer.append(data);
            writer.flush();
            writer.close();

        } catch (IOException n) {
            System.out.println(n.getMessage());
        }
	}
}
