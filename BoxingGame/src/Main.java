
public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Muhammed", 20,120, 80,100);
		Fighter f2 = new Fighter("Rocky",10,100,80,50);
		
		Match match = new Match(f1,f2,75,100);
		match.run();
		

	}

}
