import java.util.ArrayList;

public class arrayliststring {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("MUFLI");
		string.add("DIANK");
		string.add("EFENDY");
		System.out.println(string.toString());
		System.out.println("index of mufli : "+string.indexOf("mufli"));
		string.remove(2);
		System.out.println(string.toString());
		System.out.println("size : "+string.size());
		
	}

}
