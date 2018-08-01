
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		System.out.println(Handy.getName());
		Handy.eat();
		Handy.getHatColor();
		Handy.isGirlOrBoy();

		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName());
		Papa.eat();
		Papa.getHatColor();
		Papa.isGirlOrBoy();

		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		Smurfette.eat();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}
}
