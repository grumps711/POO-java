package exJson3;

enum Sexe{male,female; 
	public String toString() {
		switch (this) {
		case male:   return "home";
		case female: return "dona";
		default: return "";
		} 
	}

};

public class User {
	private Sexe gender;
	private Name name;
	private Location location;
	private String email;
	private Picture picture;
	/*public User(String gender, Name name, Location location, String email, Picture picture) {
		super();
		this.gender = gender;
		this.name = name;
		this.location = location;
		this.email = email;
		this.picture = picture.getMedium();
	}*/
	

	public Sexe getGender() {
		return gender;
	}
	public void setGender(Sexe gender) {
		this.gender = gender;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "User [gender=" + gender + ", name=" + name + ", location=" + location + ", email=" + email
				+ ", picture=" + picture + "]\n";
	}
	
	

}
