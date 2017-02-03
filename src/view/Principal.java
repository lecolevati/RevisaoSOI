package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController oc = new OperacoesController();
		int posicoes = 10;
//		oc.verificaVetor(posicoes);
		oc.operacoesString();
		String entrada = "Sistemas Operacionais I";
		oc.separaString(entrada);
	}

}
