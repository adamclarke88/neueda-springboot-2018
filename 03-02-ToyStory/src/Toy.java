
public class Toy {
	
	private String name;
	private String voiceFirstName;
	private String voiceLastName;
	
	public Toy(String name, String voiceFirstName, String voiceLastName) {
		super();
		this.name = name;
		this.voiceFirstName = voiceFirstName;
		this.voiceLastName = voiceLastName;
	}
		
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getVoiceFirstName() {
		return voiceFirstName;
	}

	public void setVoiceFirstName(String voiceFirstName) {
		this.voiceFirstName = voiceFirstName;
	}

	public String getVoiceLastName() {
		return voiceLastName;
	}

	public void setVoiceLastName(String voiceLastName) {
		this.voiceLastName = voiceLastName;
	}
	
	

}
