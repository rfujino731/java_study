package java_study;

//Staffクラスを用意する
class Staff{
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello" + this.name);
	}
}
public class Staffinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff yamada = new Staff();
		yamada.name = "taro yamada";
		
		yamada.sayhello();

	}

}
