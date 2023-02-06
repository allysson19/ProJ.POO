package UERNBETS;

public class UERNBETS {

    public static void main(String args[]){
   	 EVENTOS quartasFinal1 = new EVENTOS ("Quartas de final da copa do mundo",
   		 "Brasil", "Croácia", 1.18, 1.8, 2.5);
   	 EVENTOS quartasFinal2 = new EVENTOS ("Quartas de final da copa do mundo",
   		 "Argentina", "Holanda", 1.4, 1.5, 1.9);
   	 
   	 APOSTAS aposta1 = new APOSTAS(quartasFinal1, Resultado.TIME1, 1000);
   	 APOSTAS aposta2 = new APOSTAS(quartasFinal1, Resultado.EMPATE, 400);
   	 APOSTAS aposta3 = new APOSTAS(quartasFinal1, Resultado.TIME2, 300);
   	 
   	 quartasFinal1.setResultado(Resultado.EMPATE);
   	 
   	 if(aposta1.getResultado() == quartasFinal1.getResultado())
   		 System.out.println("O apostador ganhou R$ " + aposta1.calculaLucro(quartasFinal1));
   	 else
   		 System.out.println("O apostador perdeu R$ " +   aposta1.getValorApostado());
   	 
   	 
    }
}

