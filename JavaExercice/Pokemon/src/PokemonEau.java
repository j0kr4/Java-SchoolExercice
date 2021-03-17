public class PokemonEau extends Pokemon{
	
	public PokemonEau() {
		
	}
	
	public PokemonEau(String nom, int atk) {
		super(nom,atk);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		
		if(p.getClass().getSimpleName().equals("PokemonPlante")) {
			p.sethp(p.gethp()-2*this.getatk());
		}else if(p.getClass().getSimpleName().equals("PokemonFeu") || p.getClass().getSimpleName().equals("PokemonEau")) {
			p.sethp(p.gethp() - 0.5f * (float)this.getatk());
		}else {
			super.attaquer(p);
		}
	}
}
