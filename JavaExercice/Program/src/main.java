
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program a = new Program(7,12);
		Program abis = new Program(7,15);
		
		if(a.Same(abis)) {
			System.out.println("Identiques");
		}
		else {
			System.out.println("Diffetents");
		}
	}

}
