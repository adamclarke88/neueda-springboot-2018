import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		System.out.println("The Disney Dwarfs");
		System.out.println();
		
		for(String dwarf:dwarfs) {     	// for every dwarf (new variable) in dwarfs, print out a dwarf
			System.out.println(dwarf);
		}
		
		
		System.out.println();
		
		ArrayList dwarves = new ArrayList();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Oin");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		
		System.out.println("The other dwarves");
		System.out.println();
		
		for (int i = 0; i < dwarves.size(); i++) {
			System.out.println(dwarves.get(i));
		}
		
	}

}
