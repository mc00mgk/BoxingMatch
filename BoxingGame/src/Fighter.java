
public class Fighter {
	String name;
	int damage;
	int healty;
	int weight;
	int dodge;
	
	Fighter(String name,int damage,int healty,int weight, int dodge){
		this.name = name;
		this.damage = damage;
		this.healty = healty;
		this.weight = weight;
		this.dodge = dodge;
		
	}
	public int hit(Fighter foe) {
		
		System.out.println(this.name + " ==> "+ foe.name  +" " + this.damage +" hasar vurdu");
		  if (foe.dodge()) {
	            System.out.println(foe.name + " gelen hasarı savurdu.");
	            return foe.healty;
	        }
		
		if(foe.healty<0) {
			return 0;
		}
		return foe.healty - this.damage;
	}
	public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
	
}
