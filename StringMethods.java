package sakshigothal;

public class StringMethods {
public static void main(String[] args) {
	String i=new String("123");
	//converting char array into string
	char c[]= {'a','b','c'};
	String s=new String(c);
	System.out.println(s);
	
	//returning char by index
	String a="hello";
	char cc=a.charAt(0);
	System.out.println(cc);
	
	//length
	System.out.println(a.length());
	
	//substring
	String h="hello_world";
	System.out.println(h.substring(2));
	System.out.println(h.substring(2, 7));
	
	//contains
	System.out.println(h.contains("s"));//char it check its part of string or not
	System.out.println(h.contains("hello"));// string
	
	//join
	String st=String.join("*","hello","lovely", "poeple");
	System.out.println(st);
	String ll=String.join("/", h);// does not work
	System.out.println(ll);
	
	//to lower case
	String l="HELLO";
	System.out.println(l.toLowerCase());
	
	//to upper case
	String g="sakshi";
	System.out.println(g.toUpperCase());
	
	//trim
	String trim="       welcome      world          ";
	System.out.println(trim.trim());
	
	//return index
	String in="Twilight new moon";
	System.out.println(in.indexOf('i'));
	System.out.println(in.indexOf("new"));
	
	//split
	String[] split=in.split(" ");
	for(int k=0;k<split.length;k++) {
		System.out.println(split[k]);
	}
	
	//empty
	System.out.println(in.isEmpty());
	
	//concatenation
	String con=in.concat(" " + "saga");
	System.out.println(con);
	
	//replace
	String r="hey sakshi sakshi sakshi";
	System.out.println(r.replace('e', 'i'));
	System.out.println(r.replaceAll("sakshi","sanket"));
}

}
