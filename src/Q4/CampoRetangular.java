package Q4;

public class CampoRetangular {
	private float comprimentohori,alturaverti;
	ParOrdenado cantSesquOrdenado;
	private  Bola Esfera;
	public CampoRetangular(ParOrdenado cantSesquerdoOrdenado, float comprimentohori, float alturaverti, Bola Esfera) {
		super();
		this.cantSesquOrdenado = cantSesquerdoOrdenado;
		this.comprimentohori = comprimentohori;
		this.alturaverti = alturaverti;
		this.Esfera = Esfera;
	}
	
	public ParOrdenado getcantSesquOrdenado() {
		return cantSesquOrdenado;
	}
	
	public float getComprimento_h() {
		return comprimentohori;
	}
	
	public float getAltura_v() {
		return alturaverti;
	}
	public Bola getEsfera() {
		return Esfera;
	}
	
	public boolean MO1() {
		if (Esfera.getposicaocentral().getX()+Esfera.getRaio() >= comprimentohori/2 ) {
			return true;
			
			
		}
		else {
			return false;
	}
		
	}
	public boolean MO2() {
		if (Esfera.getposicaocentral().getX()+Esfera.getRaio() <= -comprimentohori/2 ) {
			return true;
		}
		else {
			return false;
		}
}
	public boolean MO3() {
		if (Esfera.getposicaocentral().getY()+Esfera.getRaio() >= alturaverti/2 ) {
			return true;
}
		else {
			return false;
		}
	}
	public boolean MO4() {
		if (Esfera.getposicaocentral().getY()+Esfera.getRaio() <= -alturaverti/2 ) {
			return true;
}
		else {
			return false;
		}
	}
	
	public void movimenBola() {
		if (MO1()) {
			Esfera.setVelociH(-Esfera.getVelociH());
			}
		
		else if(MO2()) {
			Esfera.setVelociH(-Esfera.getVelociH());
		}
		else if(MO3()) {
			Esfera.setVelociV(-Esfera.getVelociV());
		}
		else if(MO4()) {
			Esfera.setVelociV(-Esfera.getVelociV());
		}
		
		
		
		Esfera.movimenta();
		
		
	}
}