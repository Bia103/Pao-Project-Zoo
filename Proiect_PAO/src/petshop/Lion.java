package petshop;

public class Lion extends Animal{
	int b = 0;
	public Lion(String name, int age, String food) {
		super(name,age,food);
	}
	@Override
	public void Info() {
		System.out.println("Leu");
		super.Info();
	}
	
	@Override
	public void Interaction() {
		b++;
		if(b <=3 ) {
		System.out.println("Leul a inceput sa raga");
		}else {
			System.out.println("Leul a ragusit");
		}
		
	}
}
