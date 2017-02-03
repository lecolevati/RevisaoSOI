package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	
	public void verificaVetor(int posicoes){
		int[] vetor = new int[posicoes];
		for (int i = 0 ; i < posicoes ; i++){
			vetor[i] = (int)((Math.random() * 100) + 1);
		}
		for (int valor : vetor){
			System.out.print(valor);
			System.out.print("\t");
		}
	}
	
	public void operacoesString(){
		double tempoInicioString = System.nanoTime();
		preencheString();
		double tempoFimString = System.nanoTime();
		double tempoString = tempoFimString - tempoInicioString;
		System.out.println("String preenchida em: "+tempoString  / Math.pow(10, 9) +" s.");
		double tempoInicioStringBuffer = System.nanoTime();
		preencheStringBuffer();
		double tempoFimStringBuffer = System.nanoTime();
		double tempoStringBuffer = tempoFimStringBuffer - tempoInicioStringBuffer;
		System.out.println("StringBuffer preenchido em: "+tempoStringBuffer / Math.pow(10, 9)+" s.");
	}
	
	private void preencheString(){
		String valor = "";
		for (int i = 0 ; i < 32768 ; i++){
			valor = valor + "x";
		}
	}

	private void preencheStringBuffer(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < 32768 ; i++){
			sb.append("x");
		}
	}
	
	public void separaString(String entrada){
		String[] vetorEntrada = entrada.split(" ");
		for (String palavra : vetorEntrada){
			System.out.println(palavra);
		}
	}
}
