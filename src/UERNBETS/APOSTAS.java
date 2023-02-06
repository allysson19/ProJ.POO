package UERNBETS;

public class APOSTAS {
  private EVENTOS et01;
  private Resultado resultado;
  private double DINHEIRO;
  private double APOSTA;
public APOSTAS(EVENTOS et01,Resultado resultadoPart, double vALORAPOSTA) {
	super();
	this.et01 = et01;
	this.resultado = resultadoPart;
	APOSTA = vALORAPOSTA;
}

public EVENTOS et01() {
	return et01;
}
public Resultado getResultado() {
	return resultado;
}
public void setResultado(Resultado resultado) {
	this.resultado = resultado;
}
public double getValorApostado() {
	return APOSTA;
}
public double calculaLucro(EVENTOS valor){
	if(valor.getResultado()== resultado.TIME1) {
		DINHEIRO = APOSTA * valor.getVA01();
	}
	if(valor.getResultado()== resultado.TIME2) {
		DINHEIRO = APOSTA * valor.getVA03();
	}
	else {
		DINHEIRO = APOSTA * valor.getVA02();
	}
	return DINHEIRO;
}

}