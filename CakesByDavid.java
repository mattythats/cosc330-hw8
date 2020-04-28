public class CakesByDavid implements Bakery{
	private String name;
	private Cake c;
	public CakesByDavid(){
		name = "Cakes by David";
	}
	public Cake orderCake(String type){
		c = new Cake(name + " presents: " + type);
		return c;
	}
	public String getName(){
		return name;
	}
}