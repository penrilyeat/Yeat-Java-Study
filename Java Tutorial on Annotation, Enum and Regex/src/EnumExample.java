enum OSType{
	IOS,
	Android,
	HarmonyOS,
	ColorOS,
	OxygenOS
}
public class EnumExample {
	public static void main(String[] args) {
		Directions dir=Directions.SOUTH;
		System.out.println(dir.getDirectionCode());
		Directions dir2=Directions.EAST;
		System.out.println(dir2.getDirectionCode());
		System.out.println(Directions.SOUTH);
		System.out.println(Directions.SOUTH.getDirectionCode());
		
		System.out.println();
		OSType os=OSType.IOS;
		System.out.println("The OS I like the most is");
		switch(os)
		{
		case Android:
			System.out.println("Android");
			break;
		case IOS:
			System.out.println("IOS");
			break;
		case HarmonyOS:
			System.out.println("Harmony OS");
			break;
		case ColorOS:
			System.out.println("Color OS");
		}
	}
}
