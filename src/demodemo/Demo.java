package demodemo;

public class Demo {

	public static void main(String[] args) {
		String a = "rakesh.kumar@gmail.com";
		String b = "rakesh.kumar@gmail.com";
		String[] f_split = a.split("@");
		System.out.println(a);
		System.out.println(f_split[0]);
		String name = f_split[0];
		String[]  names = name.split("\\.");
		System.out.println(names.length);
		System.out.println(names[1]);
	}
}
