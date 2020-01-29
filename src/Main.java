class Circle{
	int cenx,ceny,rad;
	
	public Circle(int cx,int cy,int r) {
		cenx = cx;
		ceny = cy;
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("("+cenx+","+ceny+")"+","+rad);
	}
}



class Main {
	public static void main(String[] args) {
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}
}
