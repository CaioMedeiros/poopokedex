package Map;

import java.io.File;

import Entity.Player;

public class Map {
	private int linhas = 15;
	private int colunas = 15;
	
	private char[][] map;
	
	public void loadMap(String path) {
		File file = new File("map.map");
		
	}
	
	public void imprimeMapa (Player player) {
		int[] aux = player.localizacao();
		int x = aux[0], y = aux[1];
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if (i == x && j == y)
					System.out.print('j');
				else
					System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}
	
	public boolean caminhoValido(Player player, String opcao){
		if( (opcao.compareTo("w") == 0	&&	player.localizacao()[0] == 1) ||
			(opcao.compareTo("a") == 0	&&	player.localizacao()[1] == 1)||
			(opcao.compareTo("s") == 0	&&	player.localizacao()[0] == 14)||
			(opcao.compareTo("d") == 0	&&	player.localizacao()[1] == 14) ){
			System.out.println("Não pode!");
			return false;
		}
		return true;		
	}
	
	public void moveplayer(Player player, String opcao){
		if(opcao.compareTo("w") == 0)
			player.mover(player.localizacao()[0] -1, player.localizacao()[1]   );
		else if(opcao.compareTo("a") == 0)
			player.mover(player.localizacao()[0]   , player.localizacao()[1] -1);
		else if(opcao.compareTo("s") == 0)
			player.mover(player.localizacao()[0] +1, player.localizacao()[1]   );
		else if(opcao.compareTo("d") == 0)
			player.mover(player.localizacao()[0]   , player.localizacao()[1] +1);
		
	}
}
