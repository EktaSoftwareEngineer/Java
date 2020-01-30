
public class ResversentenceBYSplit {

	public static void main(String[] args) {
		String sentence = "There is a cat in the room";
		String rev[] = sentence.split(" ");
		String temp = "";
		int n= rev.length;
		
		for(int i =n-1;i>=0; i--) {
			
			temp =temp + " " + rev[i];
			
		}
		
		System.out.print(temp);
	}

}
