package uk.ac.belfastmet.ShrekToyStory.service;
import java.util.ArrayList;
import uk.ac.belfastmet.ShrekToyStory.domain.Character;

public class CharacterService {
	
	public CharacterService() {
		super();
	}
	
	public ArrayList<Character> getToyStoryCharacters(){
		
		ArrayList<Character> characters = new ArrayList<Character>();
		
		Character woody = new Character("Woody", "Toy Story", "woody.jpeg");
		characters.add(woody);
		
		Character buzzLightyear = new Character("Buzz Lightyear", "Toy Story", "buzz-lightyear.jpeg");
		characters.add(buzzLightyear);
		
		Character mrPotatoHead = new Character("Mr. Potato Head", "Toy Story", "mr-potato-head.jpeg");
		characters.add(mrPotatoHead);
		
		Character slinky = new Character("Slinky", "Toy Story", "slinky.jpeg");
		characters.add(slinky);
		
		Character rex = new Character("Rex", "Toy Story", "rex.jpeg");
		characters.add(rex);
		
		Character hamm = new Character("Hamm", "Toy Story", "hamm.jpeg");
		characters.add(hamm);
		
		return characters;
	}

}
