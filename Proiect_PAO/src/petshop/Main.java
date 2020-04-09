package petshop;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Service s = new Service();
		System.out.println("Apasati 1 pentru a introduce un nou angajat al gradinii zoologice");
		System.out.println("Apasati 2 pentru a afla informatii despre un angajat(detaliat)");
		System.out.println("Apasati 3 pentru a afla informatii despre animalele de care are grija un angajat");
		System.out.println("Apasati 4 pentru a concedia un angajat");
		System.out.println("Apasati 5 pentru a afisa lista angajatilor");
		System.out.println("Apasati 6 pentru a afisa salariul angajatilor");
		System.out.println("Apasati 7 pentru a muta un animal aflat in grija unui angajat in grija altui angajat");
		System.out.println("Apasati 8 pentru a sterge un animal din grija unui angajat");//
		System.out.println("Apasati 9 pentru a adauga un animal in grija unui angajat");
		System.out.println("Apasati 10 pentru a interactiona cu animalele unui angajat");//
		System.out.println("Apasati 0 pentru a iesi");
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		while(x != 0) {
			s.Request(x);
			x = keyboard.nextInt();
		}
	}
}
