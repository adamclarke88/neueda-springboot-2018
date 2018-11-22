package uk.ac.belfastmet.ShrekToyStory.domain;

public class Character {
	
	private String name;
	private String movie;
	private String image;
	
	public Character() {
		super();
	}

	public Character(String name, String movie, String image) {
		super();
		this.name = name;
		this.movie = movie;
		this.image = image;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
