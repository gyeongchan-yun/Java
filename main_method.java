class MainMethod {
	public static void main(String[] args) {
		System.out.println("Hello World!"); //print "hello world!"
		System.out.println(args[0]); //print args (command parameter)

		String a = "Hello Java";
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java","python"));
		System.out.println(a.substring(0,4));
		System.out.println(a.toUpperCase());
	}
}

