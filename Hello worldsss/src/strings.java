
public class strings {
	public static void main(String[] args) {
		//string literal
		String name = "Dhana";
		String s2 = new String("Vimal");
		//char array
		char[] c= {'a','e','i','o','u'};
		String s3 = new String(c);
		
		byte[] b= {65,66,67};
		String s4 = new String(b);
		System.out.println("Name:"+name.length());
		System.out.println("Length of name:"+ name.length());
		System.out.println(s3);
		System.out.println(s4);
	}
}
