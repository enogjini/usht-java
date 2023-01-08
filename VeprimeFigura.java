//Te ndertohet interface VeprimeFigura, me tre funksione ne te llogSiperfaqe(), llogPerimetri(), llojFigures(). Te ndertohet klasa Drejtekendesh qe implementon VeprimeFigura. Te ndertohet klasa Katror qe implementon VeprimeFigura
interface VeprimeFigura {
	
	
	void llogP(int a, int b);
	void llogS(int a, int b);
	void llojiF(int a, int b);
}

class Drejtkendesh1 implements VeprimeFigura {
	int a;
	int b;
    int p;
    int s;
	
	@Override
	public void llogP(int a, int b){
		 p = a + b;
	}
	
	
	@Override
	public void llogS(int a, int b){
		 s = a * b;
	}
	

	@Override
	public void llojiF(int a, int b){
        if (a!=b)
        System.out.println("eshte drejtkendesh");
	}
	
	public void printStates() {
		System.out.printf("siperfaqja: " + s
			+ "\n perimetri: " + p + "\n lloji i fig: ");
			
	}
}

class Katror implements VeprimeFigura {
	int a;
	int b;
    int p;
    int s;

	@Override
	public void llogP(int a, int b){
		 p = a + b;
	}
	
	
	@Override
	public void llogS(int a, int b){
		 s = a * b;
	}
	
	
	@Override
	public void llojiF(int a, int b){
        if (a==b)
        System.out.println("eshte katror");
		
	}
	
	public void printStates() {
		System.out.printf("siperfaqja: " + s
			+ "\n perimetri: " + p + "\n lloji i fig: ");
			llojiF(a, b);
	}
	
}
class tesfet {
	
	public static void main (String[] args) {
	
		Drejtkendesh1 dr = new Drejtkendesh1();
		System.out.println("gjendja e figures :");
		dr.llogP(2, 4);
		dr.llogS(2, 4);
		dr.printStates();
		dr.llojiF(2, 4);
		
		
	    Katror k = new Katror();
		System.out.println("\ngjendja e fig :");
		k.llogP(4, 4);
		k.llogS(4, 4);
		k.printStates();
	}
}
