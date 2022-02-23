package solidPrinciples.l.solution;

public class Crow implements FlayingBird  {


	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}
}
