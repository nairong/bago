package dados;

import java.util.ArrayList;

public class Jogador {
	
	private int dado[];
	private boolean morto;
	private ArrayList<Dado> dados = new ArrayList<>();
	
	
	public Jogador(int qtdeDados) {
		dados = criarDados(qtdeDados);
		morto = false;	
	}
	
	private ArrayList<Dado> criarDados(int qtdeDados) {
		dados.add(dado);
		
		
		
		int dado[][] = new int[qtdeDados][6];
		for (int i = 0; i <qtdeDados; i++) {
			dado[i][0] = 1;
			dado[i][1] = 2;
			dado[i][2] = 3; 
			dado[i][3] = 4;
			dado[i][4] = 5;
			dado[i][5] = 6;
		}			
		return dado;
	}	
	
	private void perderDado() {
		dado = dado[]
	}

}
