package br.uern.di.poo.unidade1.construcao;

public class Porta {
     private TipoPORTA tipo;
     private double Largura,Altura;
	 private boolean pivoltante;
	 private double ValorPorta;
    
     final private int Pivoltante=350;
     final private double LARGURA =0.70;
     final private double ALTURA =1.8; 
         
     public Porta() {
 		super();
 		tipo= TipoPORTA.Simples;
 		Altura= ALTURA;
 		Largura=LARGURA;
 		pivoltante = false;
 	}
    public Porta(TipoPORTA tipo,double Largura,double Altura,boolean pivoltante) {
    	this.Largura = Largura;
    	this.Altura = Altura;
    	this.pivoltante = pivoltante;
    	this.tipo = tipo;
    	System.out.println("A largura: \n"+Largura);	
    }
    public double calculaPreco() {
    	double Metros = Largura * Altura;
    	
    	if(tipo == TipoPORTA.Simples)
			ValorPorta = Metros*50;
    	else if(tipo == TipoPORTA.Padrao)
    		ValorPorta = Metros*140;
    	else if(tipo == TipoPORTA.luxo)
    		ValorPorta = Metros*350;
    	return ValorPorta;
    }
    public void exibePorta() {
    	System.out.println("----------------Informações sobre as portas----------------");
    	System.out.println("Tipo de Porta:" + this.tipo );
    	System.out.println("Largura: "+this.Largura);
    	System.out.println("Altura: "+this.Altura);
    	System.out.println("Pivoltante: "+this.Pivoltante);
    	System.out.printf("Valor da Porta em R$: %.2f\n", calculaPreco());
    	System.out.println("------------------------------FIM--------------------------");
   
   }
	public TipoPORTA getTipo() {
		return tipo;
	}
	public void setTipo(TipoPORTA tipo) {
		this.tipo = tipo;
	}
	public double getLargura() {
		return Largura;
	}
	public void setLargura(double largura) {
		Largura = largura;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public boolean isPivoltante() {
		return pivoltante;
	}
	public void setPivoltante(boolean pivoltante) {
		this.pivoltante = pivoltante;
	}
	public double getValorPorta() {
		return ValorPorta;
	}
	public void setValorPorta(double valorPorta) {
		ValorPorta = valorPorta;
	}
	public int getPivoltante() {
		return Pivoltante;
	}
	public double getLARGURA() {
		return LARGURA;
	}
	public double getALTURA() {
		return ALTURA;
	} 
    
}
