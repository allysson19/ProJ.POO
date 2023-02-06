package UERNBETS;

public class EVENTOS {
 private String evt1,op1,op2;
 private double VA01,VA02,VA03;
 private Resultado resultadoevento;
 public EVENTOS(String evt1, String op1, String op2, double vA01, double vA02, double vA03) {
	super();
	this.evt1 = evt1;
	this.op1 = op1;
	this.op2 = op2;
	VA01 = vA01;
	VA02 = vA02;
	VA03 = vA03;
}
 
 public Resultado getResultado() {
	return resultadoevento;
}

public void setResultado(Resultado FinaljOGO) {
	resultadoevento =  FinaljOGO;
 }

public double getVA01() {
	return VA01;
}

public void setVA01(double vA01) {
	VA01 = vA01;
}

public double getVA02() {
	return VA02;
}

public void setVA02(double vA02) {
	VA02 = vA02;
}

public double getVA03() {
	return VA03;
}

public void setVA03(double vA03) {
	VA03 = vA03;
}
 

}