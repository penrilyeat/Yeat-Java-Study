package forEach;

import java.util.ArrayList;
import java.util.List;

public class StreamforEachOrdered {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Yeat");
		names.add("Phybee");
		names.add("Sylvia");
		names.add("Jaden");
		names.add("Shiro");
		names.add("Melisa");
		names.add("Sharon");
		//forEach - the output would be in any order
		System.out.println("Print using forEach");
		names.stream()
		.filter(f->f.startsWith("S"))
		.parallel()
		.forEach(n->System.out.println(n));
		
		/*forEachOrdered - the outpupt would always be in this order:
		 * Sylvia Shiro Sharon
		 */
		System.out.println("Print using forEach");
		names.stream()
		.filter(f->f.startsWith("S"))
		.parallel()
		.forEachOrdered(n->System.out.println(n));
	}
}
