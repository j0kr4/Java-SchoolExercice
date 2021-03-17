
public class Program {
	private int b;
	private int d;
	
	public Program(int c, int e)
	{
		this.b = c;
		this.d = e;
	}
	
	public int getb() {
		return this.b;
	}
	
	public int getd() {
		return this.d;
	}
	
	public boolean Same(Program p) {
		return this.b == p.getb() && this.d == p.getd();
	}
}

