package dp;

public class Member {
	private String name;
	private String id;
	private Address address;
	public Member(String name, String id, Address adress) {
		this.name = name;
		this.id = id;
		this.address = adress;
	}
	public String getName() { return name; }
	public String getId() { return id; }
	public Address getAddress() { return address; }
	
}