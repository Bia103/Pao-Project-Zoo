package petshop;
import java.util.*; 

public class ZooKeeper extends Employee{
	int numberOfAnimals = 0;
	Queue<Animal> ani = new LinkedList<Animal>();
	public ZooKeeper (String name, int age, int numberOfAnimals) {
		super(name, age);
		//this.numberOfAnimals = numberOfAnimals;
	}
	
	@Override
    public float SalaryCalculator() 
    { 
        float salary = super.GetSalary();
        salary = salary + (((ani.size() + 1) * 10) * salary)/100;
        return salary;
    } 
	
	@Override
	public void Info() {
		super.Info();
		System.out.println("Job: Zookeeper");
	}
	@Override
	public void DetInfo() {
		super.Info();
		for(Animal item : ani){
		    item.Info();
		}
	}
	@Override
	public void AddAnimal(Animal an) {
		ani.add(an);
	}	
	@Override
	public void PrintAnimal() {
		for(Animal item : ani){
		    item.Info();
		}
	}
	@Override
	public String RetFood(String s){
		for(Animal item : ani){
		    if(item.GetName().equals(s)) {
		    	return item.GetFood();
		    }
		}
		return "";
	}
	@Override
	public int RetAge(String s) {
		for(Animal item : ani){
		    if(item.GetName().equals(s)) {
		    	return item.GetAge();
		    }
		}
		return 0;
	}
	@Override
	public void DeleteAnimal(String s) {
		for(Animal item : ani){
		    if(item.GetName().equals(s)) {
		    	ani.remove(item);
		    	break;
		    }
		}

	}
	@Override
	public void Interact() {
		for(Animal item : ani){
		    	item.Interaction();
		    }
		

	}
}
