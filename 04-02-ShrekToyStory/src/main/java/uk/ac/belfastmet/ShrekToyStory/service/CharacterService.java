package uk.ac.belfastmet.ShrekToyStory.service;

import java.util.ArrayList;
import uk.ac.belfastmet.ShrekToyStory.domain.Character;

public class CharacterService {
	
	public CharacterService() {
		super();
	}
	
	public ArrayList<Character> getToyStoryCharacters(){
		
		ArrayList<Character> characters = new ArrayList<Character>();
		
		Character woody = new Character("Woody", "Toy Story", "woody.jpg");
		characters.add(woody);
		
		Character buzzLightyear = new Character("Buzz Lightyear", "Toy Story", "buzz-lightyear.jpg");
		characters.add(buzzLightyear);
		
		Character mrPotatoHead = new Character("Mr. Potato Head", "Toy Story", "mr-potato-head.jpg");
		characters.add(mrPotatoHead);
		
		Character slinky = new Character("Slinky", "Toy Story", "slinky.jpg");
		characters.add(slinky);
		
		Character rex = new Character("Rex", "Toy Story", "rex.jpg");
		characters.add(rex);
		
		Character hamm = new Character("Hamm", "Toy Story", "hamm.jpg");
		characters.add(hamm);
		
		return characters;
	}

}
