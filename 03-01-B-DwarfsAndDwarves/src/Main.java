import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dwarf happy = new Dwarf();
		
		happy.setName("happy");
		happy.setAuthor("Disney");
		happy.setImage("happy.png");
		
		Dwarf sleepy = new Dwarf();
		
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("sleepy.png");
		
		Dwarf dopey = new Dwarf();
		
		dopey.setName("dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("dopey.png");
		
		Dwarf bashful = new Dwarf();
		
		bashful.setName("bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("bashful.png");
		
		Dwarf sneezy = new Dwarf();
		
		sneezy.setName("sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("sneezy.png");
		
		Dwarf doc = new Dwarf();
		
		doc.setName("doc");
		doc.setAuthor("Disney");
		doc.setImage("doc.png");
		
		Dwarf grumpy = new Dwarf();
		
		grumpy.setName("grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("grumpy.png");
		
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(happy);
		dwarfs.add(sleepy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		
		for(Dwarf dwarf:dwarfs) {
			System.out.println(dwarf.getName());
		}
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "gloin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		
		System.out.println();

		for(Dwarf dwarf:dwarfs) {
			System.out.println(dwarf.getName());
		}
		
	}

}
