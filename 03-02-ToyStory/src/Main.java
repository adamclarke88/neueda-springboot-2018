import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Toy> toys = new ArrayList<Toy>();
		
		Toy woody = new Toy("Woody", "Tom", "Hanks");
		Toy buzz = new Toy("Buzz", "Tim", "Allen");
		Toy slinky = new Toy("Slinky", "Jim", "Varney");
		Toy ham = new Toy("Ham", "John", "Ratzenberger");
		Toy rex = new Toy("Rex", "Wallace", "Shaun");
		Toy mrPotatoHead = new Toy("Mr Potato Head", "Don", "Rickles");
		
		toys.add(woody);
		toys.add(buzz);
		toys.add(slinky);
		toys.add(ham);
		toys.add(rex);
		toys.add(mrPotatoHead);
		
		for(Toy toy:toys) {
			System.out.println(toy.getName() + "," + " Voiced by: " + toy.getVoiceFirstName() + " " + toy.getVoiceLastName());
		}
	}

}
