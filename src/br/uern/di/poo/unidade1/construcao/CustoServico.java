package br.uern.di.poo.unidade1.construcao;

public class CustoServico {
 static final double Luxo =0.1;
 static final double Instalacao=70.0;
 static final double InstPivoltante=250.0;
 
 public static double CalcularServico(Porta PORTT) {
	double Metros = PORTT.getAltura() * PORTT.getLargura();
	 
	 double VAL_total=Metros*70.0;
	 if(PORTT.isPivoltante()==true ) {
		 VAL_total = VAL_total+InstPivoltante;
		 
	 }
	 if(PORTT.getTipo()==TipoPORTA.luxo) {
		 VAL_total= VAL_total*0.1+VAL_total;
		 
	 }
	
	    System.out.println("-------------------------------------------\n");
		System.out.printf("O VALOR DA INSTALAÇÃO É: R$%.2f\n", VAL_total);
		System.out.println("-------------------------------------------\n");  
	return VAL_total; 
	 
 }
}
