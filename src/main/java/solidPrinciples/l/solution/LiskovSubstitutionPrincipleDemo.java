package solidPrinciples.l.solution;

public class LiskovSubstitutionPrincipleDemo {

	public static void main(String[] args) {
		FlayingBird[] flayingBird = new FlayingBird[] { new Crow(), new Sparrow() };
		for (FlayingBird bird : flayingBird) {
			 bird.fly();
			 bird.eat();
		}
		System.out.println("======================");
		Bird[] birds = new Bird[] { new Sparrow() };
		for (Bird bird : birds){
			bird.eat();
		}

	}

}
