interface Printable{
	void print(String s);
}
class OneParamNoReturn {
	public static void main(String[] args) {
		Printable p;
		p = (String s) -> {System.out.println(s);};
		p.print("Lambda exp one");
		
		p = (String s) -> System.out.println(s);
		p.print("Lambda exp two");
		
		p = (s) -> System.out.println(s);
		p.print("Lambda exp three");
		
		p = s -> System.out.println(s);
		p.print("Lambda exp four");
	}
}
