
public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(	Fighter f1,Fighter f2,int minWeight,int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	public void run() {
		if(isCheck()) {
			while (this.f1.healty>0 && this.f2.healty>0) {
				System.out.println("-----------NEW ROUND----------");
				this.f2.healty = this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				
				this.f1.healty = this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				System.out.println(this.f1.name + " SAGLIK : "+ this.f1.healty);
				System.out.println(this.f2.name +" SAGLIK : " + this.f2.healty);
			}
		}else {
			System.out.print("Sporcularin sikletleri uyusmuyor. ");
		}
		
	}
	
	  public boolean isCheck() {
		return(this.f1.weight< maxWeight && this.f1.weight>minWeight) && (this.f2.weight< maxWeight && this.f2.weight> minWeight);
	}
	  public boolean isWin() {
		  if(this.f1.healty == 0) {
			  System.out.println("KAZANAN : " + f2.name);
			  return true;
		  }
		  if(this.f2.healty == 0) {
			  System.out.println("KAZANAN : " + f1.name);
			  return true;
		  }
		  return false;
		  
	  }

}
