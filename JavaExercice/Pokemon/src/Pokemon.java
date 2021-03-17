public class Pokemon {

	private String nom;
	private float hp;
	private int atk;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String n, int a) {
		this.nom = n;
		this.hp = 100;
		this.atk = a;
	}
	public String getnom() {
		return this.nom;
	}
	public void setnom(String n) {
		this.nom = n;
	}
	
	public float gethp() {
		return this.hp;
	}
	public void sethp(float h) {
		this.hp = h;
	}	
	
	public int getatk() {
		return this.atk;
	}
	public void setatk(int a) {
		this.atk = a;
	}
	
	public boolean isDead() {
		return this.hp<=0;
		}
	
	public void attaquer(Pokemon p) {
		p.sethp(p.gethp()-this.atk);
	}
	
	@Override
	public String toString() {
		return this.nom+" HP:"+this.hp+" atk:"+this.atk;
	}
}
