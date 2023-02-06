package Q4;

public class Bola {
	ParOrdenado posicaocentral;
	float velociH,velociV;
	final int Raio = 5;
	public Bola(ParOrdenado posisaocentralOrdenado, float velociH, float velociV) {
		super();
		this.posicaocentral = posisaocentralOrdenado;
		this.velociH = velociH ;
		this.velociV = velociV;
	}
	public float getVelociH() {
		return velociH;
	}
	
	public void setVelociH(float velociH) {
		this.velociH = velociH;
	}
	
	public float getVelociV() {
		return velociV;
	}
	
	public void setVelociV(float velociV) {
		this.velociV = velociV;
	}
	
	public ParOrdenado getposicaocentral() {
		return posicaocentral;
	}


	public int getRaio() {
		return Raio;
	}
	public void movimenta(){
		posicaocentral.setX(velociH + posicaocentral.getX());
		posicaocentral.setY(velociV + posicaocentral.getY());
	}
	@Override
	public String toString() {
		return "\"A bola está na posição" +posicaocentral.toString()+ "se movendo a uma velocidade ("+velociH  +","+velociV + ") pixels por movimento\"";
	}
}