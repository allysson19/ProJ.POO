package br.uern.di.poo.unidade1.construcao;

public class principal {
	public static void main(String[]args) {
 Porta Porta01 = new Porta(); 
 Porta Porta02 =  new Porta(TipoPORTA.Padrao,0.3,2.3,true);
 Porta Porta03 =  new Porta(TipoPORTA.luxo,0.2,1.3,true);
 Porta Porta04 =  new Porta(TipoPORTA.Padrao,0.7,3.3,false);

 Porta02.exibePorta();
	Porta02.exibePorta();
	CustoServico.CalcularServico(Porta01);
	Porta02.exibePorta();
	CustoServico.CalcularServico(Porta02);
	Porta03.exibePorta();
	CustoServico.CalcularServico(Porta03);
	Porta04.exibePorta();
	CustoServico.CalcularServico(Porta04);
 
}
}