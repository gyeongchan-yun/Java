import java.util.ArrayList; //To use ArrayList
import java.util.HashMap;

class MainMethod {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println(args[0]); //print args (command parameter)

		// string method
		String a = "Hello Java";
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java","python"));
		System.out.println(a.substring(0,4));
		System.out.println(a.toUpperCase());

		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		sb.insert(0,"hello ");
		System.out.println(sb.toString());

		int [] odds = {1,3,5,7,9};
		String[] weeks = {"Monday","Tuesday", "Wendesday", "Thursday", "Friday", "Saturday", "Sunday"};

		ArrayList<String> str_list = new ArrayList<String>(); //Generics
		str_list.add("123");
		str_list.add("456");

		System.out.println(str_list.get(1));

		System.out.println(str_list.size());

		HashMap <String, String> map = new HashMap<String, String>();
		map.put("major","cse");

		for(String day: weeks) {
			System.out.println(day);
		}
	}
}

