import java.util.Random;

class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0;i<7;i++) {
			System.out.println(rand.nextInt(10000));
			System.out.println(rand.nextDouble());
		}
	}
}
