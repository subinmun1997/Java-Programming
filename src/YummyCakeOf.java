class Cake{
	
}
class CheeseCake extends Cake{
	
}
class StrawberryCheeseCake extends CheeseCake{
	
}
class YummyCakeOf {
	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();
		
		if(cake instanceof Cake) {
			System.out.println("����ũ �ν��Ͻ� or");
			System.out.println("����ũ ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof CheeseCake) {
			System.out.println("ġ������ũ �ν��Ͻ� or");
			System.out.println("ġ������ũ ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ũ �ν��Ͻ� or");
			System.out.println("����ġ������ũ ����ϴ� �ν��Ͻ�");
		}
	}
}
