package br.uern.di.poo.unidade1.construcao;

public enum TipoPORTA{
	Simples("Madeira Compensada","Fechadura simples",50),
	Padrao("Madeira Andirobe","fechadora de encaixe",140),
	luxo("Madeira de IPE","Fechadura Tetra",350);
	
	
	
	private final int Valor;
	private final String Material,fechadura;
	private TipoPORTA(String material, String fechadura, int valor) {
		Material = material;
		this.fechadura = fechadura;
		Valor = valor;
	}
	public String getMaterial() {
		return Material;
	}
	public String getFechadura() {
		return fechadura;
	}
	public int getValor() {
		return Valor;
	}
}
