
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature Sp = new SeaCreature("Spongebob");
	System.out.println(Sp.getName());
	Sp.eat();
	
	SeaCreature Pa = new SeaCreature("Patrick");
	System.out.println(Pa.getName());
	Pa.eat();
	
	
	SeaCreature Sq = new SeaCreature("Squidward");
	System.out.println(Sq.getName());
	Sq.eat();
	
	
}
}
