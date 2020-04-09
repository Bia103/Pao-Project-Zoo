package petshop;

public class Parrot extends Animal{
	int b = 0;
	public Parrot(String name, int age, String food) {
		super(name,age,food);
	}
	
	@Override
	public void Info() {
		System.out.println("Papagal");
		super.Info();
	}
	@Override
	public void Interaction() {
		b++;
		if(b <=3 ) {
		System.out.println("Papagalul a inceput sa spuna Coco");
		}else {
			System.out.println("Papagalul vorbeste acum fluent japoneza");
		}
		
	}
}
