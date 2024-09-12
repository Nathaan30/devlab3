package br.edu.iesb.poo2024.devlab3;

public class Main {

	public static void main(String[] args) {
		
	// mais generico	
	ClasseAbstrataOO concreta1 = new ClasseConcretaOO();
	concreta1.printMensagem();
	concreta1.metodoConcoreto();
	System.out.println(concreta1.msg);
	concreta1.msg = "Essa classe nao eh abstrata coisa nenhuma!";
	System.out.println(concreta1.msg);
	
	System.out.println("\n- - - - - - - - - - - - - -");
	
	System.out.println("\n\n");
	
	// mais especializado
	ClasseConcretaOO2 concreta2 = new ClasseConcretaOO2();
	concreta2.printMensagem();
	concreta2.metodoConcoreto();
	
	System.out.println("\n- - - - - - - - - - - - - -");
	
	System.out.println(IGerenciaArquivo.TIPO_ARQUIVO_CSV);
	// IGerenciaArquivo.TIPO_ARQUIVO_CSV = "";
	ClasseConcretaOO3 concreta3 = new ClasseConcretaOO3();
	concreta3.lerArquivoDisco(null, false);
	
	
	}

}
