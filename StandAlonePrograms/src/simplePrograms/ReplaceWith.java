package simplePrograms;

public class ReplaceWith {
	
	String email = "singh.ravinder900@gmail.com";
	char[] emailChar = email.toCharArray();
	//char[] replace = '<Dot>';
	StringBuilder sb = new StringBuilder();
	
	public void replaceWith(){
		for(int i = 0; i < emailChar.length; i++){
			if (email.charAt(i) == 46){
				//System.out.println(email.charAt(i));
				sb.append(emailChar);
				sb.replace(i, i, "<Dot>");
			}
		}
		//System.out.println(sb);
	}

	public static void main(String[] args) {
		
		ReplaceWith rw = new ReplaceWith();
		rw.replaceWith();
	}
}
