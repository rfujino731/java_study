package java_study;

//Staffクラスを用意する
class Staff{
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello" + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff yamada = new Staff("Taro Yamafa", 123, "yamada@java.com");
		//yamada.name = "taro yamada";
		
		//yamada.sayhello();
		
		System.out.println("[社員情報]");
		System.out.println("氏名: " + yamada.getName());
		System.out.println("社員番号: " + yamada.getStaffid());
		System.out.println("Email: " + yamada.getEmail());

	}

}
