
public class ReverseString {
	
	public static void main(String[] args){
	  /*  String string ="abcdefghijklmnopqrstuvwxyz";
	    StringBuilder sb = new StringBuilder(string);
	    sb.reverse();
	    System.out.println(sb);
	    */
	    String a="a";
	    System.out.println("a 1-->"+a.hashCode());
	    String b=a;
	    a="ty";
	    System.out.println("a 2-->"+a.hashCode());
	    System.out.println("b  -->"+b.hashCode());
	}

}
