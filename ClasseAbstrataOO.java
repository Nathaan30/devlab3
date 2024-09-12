package br.edu.iesb.poo2024.devlab3;

public abstract class ClasseAbstrataOO {
	
	protected String msg = "Essa classe eh abstrata!";
	
	// metodo abstrato
	public abstract void printMensagem();
	
	public void metodoConcoreto() {
		System.out.println("metodoConcreto() da classe Abstrata");
	}

}
