public class ClassicCakes implements Bakery{
	private String name;
	private Cake c;
	public ClassicCakes(){
		name = "Classic Cakes";
	}
	public Cake orderCake(String type){
		c = new Cake(type += " by " + name);
		return c;
	}
	public String getName(){
		return name;
	}
}