
public class StringInJava {
	public static void main(String[] args) {
		String a = "Zoo";
		String b = "Zoo";
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(Integer.toHexString(b.hashCode()));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(a == b);
		System.out.println(a.equals(b));

		String c = new String("Zoo");
		String d = new String("Zoo");
		System.out.println(Integer.toHexString(c.hashCode()));
		System.out.println(Integer.toHexString(d.hashCode()));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(c == d);
		System.out.println(c.equals(d));
		System.out.println(new Object());
		System.out.println(new Object());

		System.out.println("\nEXTRA INTEGER");
		Integer x = Integer.valueOf("65");
		Integer y = Integer.valueOf("65");
		System.out.println(x == y);
		System.out.println(x.compareTo(y));

	}
}
