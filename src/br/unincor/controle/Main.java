package br.unincor.controle;

import br.unincor.view.Usuario;
import br.unincor.controle.Operacoes;
import java.util.ArrayList;
import java.util.List;

import br.unincor.model.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		Usuario gui = new Usuario();
		
		Operacoes op = new Operacoes();
		
		Integer qtde = gui.recebeInteiro("Informe a quantidade de Pokemons: ");
		
		List<Pokemon> listaPokemons = new ArrayList<Pokemon>();  
			
			for (int i = 0; i < qtde; i++) {
				
				Pokemon poke = new Pokemon(gui.recebeTexto("Informe o nome do Pokemon: "),
											(gui.recebeTexto("Informe seu tipo: ")),
											 (gui.recebeDouble("Informe seu peso: ")),
											  (gui.recebeDouble("Informe sua altura: ")));
				listaPokemons.add(poke);
											  
			}
			
			gui.exibeMsg(op.pokemonMaiorCp(listaPokemons));
			gui.exibeMsg(op.pokemonMenorCp(listaPokemons));
		
	}
		
	

}
