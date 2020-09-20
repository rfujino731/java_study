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
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff yamada = new Staff("Taro Yamafa", 123, "yamada@java.com");
		//yamada.name = "taro yamada";
		
		yamada.sayhello();

	}

}
