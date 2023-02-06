package Q4;

import java.util.Random;
import java.util.Scanner;

public class TesteCampo2 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("INFORME A LARGURA DO CAMPO");
		float largcomp = entrada.nextFloat();
		System.out.println("INFORME A ALTURA DO CAMPO");
		float altucomp = entrada.nextFloat();
		System.out.println("INFORME A DIMENSÃO DO RAIO");
		ParOrdenado bolla = new ParOrdenado(0,0);
		float alturamin = (altucomp * 5/100);
		float alturamax = (altucomp *10/100);
		float largmini = (largcomp * 5/100);
		float largmaxi = (largcomp * 10/100);
		
		Random random = new Random();
        float bolaH =  random.nextFloat(largmaxi - largmini) + largmini;
        float bolaV    =  random.nextFloat(alturamax - alturamin) + largmini;
        Bola bol = new Bola(bolla,bolaH,bolaV);
        CampoRetangular endcamp = new CampoRetangular(bolla,largcomp,altucomp,bol);
        
        for (int i = 0; i < 30; i++) {
    		endcamp.movimenBola();
    		System.out.println( bol.toString());
    	}
		entrada.close();
	}
}
