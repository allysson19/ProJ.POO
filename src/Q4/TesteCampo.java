package Q4;

import java.util.Scanner;

public class TesteCampo {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite a Altura do campo:\n ");
		float altura = entrada.nextFloat();
		
		System.out.println(" Digite a Largura:\n ");
		float largura = entrada.nextFloat();
		
		System.out.println(" Valor do canto Superior X:\n ");
		int  x = entrada.nextInt();
		
		System.out.println(" Valor do canto Superior Y:\n ");
		int y = entrada.nextInt();
		 
		ParOrdenado dadoscampo = new ParOrdenado(x,y);
		
		System.out.println(" Digite o Valor do Raio da Bola:\n ");
		System.out.println(" Agora o Valor da Velocidade Horizontal:\n ");
		float velohori = entrada.nextFloat();
		
		System.out.println(" Agora o Valor da Velocidade Vertical :\n");
		float veloverti = entrada.nextFloat();
		
		System.out.println(" Valor inicial da Bola X :\n ");
		   x = entrada.nextInt();
		
		System.out.println(" Valor inicial da Bola Y :\n ");
		   y = entrada.nextInt();
		
		ParOrdenado dadosdabola = new ParOrdenado(x,y);
		
		 Bola bol = new Bola(dadosdabola,velohori,veloverti );
		 
		 CampoRetangular campret =  new CampoRetangular (dadoscampo,altura,largura, bol); 
		
		for (int i = 0; i < 30; i++) {
			campret.movimenBola();
			System.out.println( bol.toString());
		}
		
		
		entrada.close();	

			
		}
}
