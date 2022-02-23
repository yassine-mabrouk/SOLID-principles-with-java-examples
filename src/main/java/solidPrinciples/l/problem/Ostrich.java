package solidPrinciples.l.problem;

public class Ostrich implements Bird {
	
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Cannot fly ");
	}

	@Override
	public void eat() {
		System.out.println("Ostrich eats");
	}
}
