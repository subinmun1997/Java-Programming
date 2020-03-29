interface Scale{
	int DO = 0; int RE = 1; int MI = 2;
	int FA = 4; int SO = 5; int RA = 6; int TI = 7;
}

class InterfaceBaseConst {
	public static void main(String[] args) {
		int sc = Scale.DO;
		
		switch(sc) {
		case Scale.DO:
			System.out.println("도~ ");
			break;
			
		case Scale.RE:
			System.out.println("레~ ");
			break;
		case Scale.MI:
			System.out.println("미~ ");
			break;
		case Scale.FA:
			System.out.println("파~ ");
			break;
		default:
			System.out.println("솔~ 라~ 시~");
		}
	}
}
