
public class ReverseString {

	public static void main(String[] args) {
		String input="hello world";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			      char c=input.charAt(i);
			      output=output+c;
		}
		System.out.println(output);

	}

}
