package Q1;

import java.util.Scanner;

public class ALT_A {
static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
     int QUANT_LETRA, A, B, C;
        System.out.println("Digite uma palavra com cinco letras  \n");
		String PALA = entrada.nextLine();
		QUANT_LETRA = PALA.length();
		System.out.println("Combinacoes possiveis: \n");
		for(A = 0; A < QUANT_LETRA; A++)
			for(B= 0; B < QUANT_LETRA;B++)
				for(C = 0; C< QUANT_LETRA;C++) {
					if(A != B && A != C && B != C)
						System.out.printf("\n %c%c%c \n",PALA.charAt(A), PALA.charAt(B), PALA.charAt(C));
			
	}
  }
}