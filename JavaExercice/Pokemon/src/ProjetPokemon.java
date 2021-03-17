
public class ProjetPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokemonFeu salameche = new PokemonFeu("Salameche",10);
		PokemonEau magicarpe = new PokemonEau("Magicarpe", 4);
		
		magicarpe.attaquer(salameche);
		
		System.out.println(salameche.toString());
		System.out.println(magicarpe.toString());
	}

}
