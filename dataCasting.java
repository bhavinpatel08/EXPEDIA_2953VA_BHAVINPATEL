
public class dataCasting {

	public static void main(String[] args) {
	
		String ab="Bhavin patel";
		String ab1="bhavin patel";
		String bb="jjj";
		System.out.println(ab.length());
		System.out.println(ab.toUpperCase());
		System.out.println(ab.toLowerCase());
		System.out.println(ab.indexOf("patel"));
		System.out.println(ab.concat(bb));
		System.out.println(ab.charAt(5));
		System.out.println(ab.compareTo(ab1));
		System.out.println(ab.compareToIgnoreCase(ab1));
		System.out.println(ab.contains("pate"));
		System.out.println(ab1.replace("bhavin", "komal"));
		String ab3="bhavin          patel";
		System.out.println(ab3.replaceAll(" ", ""));
		System.out.println(ab3.replaceFirst("a", "aa"));
		String ab5="bhavin,syrus,saima";
		String[] kk=ab5.split( ",");
		for(int i=0;i<kk.length;i++)
		{
			System.out.println(kk[i]);
		}
		String ab66="   bhavin patel     ";
		System.out.println(ab66.replaceFirst("   ", ""));
		System.out.println(ab66.trim());
		System.out.println(ab66.toCharArray());
	}

}
