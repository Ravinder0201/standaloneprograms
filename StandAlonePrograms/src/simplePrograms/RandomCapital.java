package simplePrograms;

public class RandomCapital {

	String name = "ravinder singh";
	
	public void randomCaps(){
		char[] in = name.toCharArray();
		for (int i = 0; i < name.length(); i++){
			int ran = (int) (Math.random() * name.length());
			char name1 = name.charAt(ran);
			Character name2 = new Character(name1);
			String name3 = name2.toString();
			String name4 = name3.toUpperCase();
			char cha = name4.charAt(0);
			in [ran] = cha;
		}
		System.out.println(in);
	}
	
	public static void main(String[] args) {

		RandomCapital rc = new RandomCapital();
		rc.randomCaps();
		
	}

}
