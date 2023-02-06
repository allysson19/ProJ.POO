package Q1;

import java.util.Scanner;

public class ALT_B {
 public static void main(String[]args) {
	 System.out.println("Digite o dia,mes e o ano: \n");
	 int DIA,MES,ANO;
	 try (Scanner input = new Scanner(System.in)) {
		DIA = input.nextInt();
		 MES = input.nextInt();
		 ANO =  input.nextInt();
	}
	 if(MES==1) {
		 System.out.println("JANEIRO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==2) {
		 System.out.println("FEVEREIRO"+"/"+DIA+"/"+ANO);
	 }	
	 if(MES==3) {
		 System.out.println("MARCO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==4) {
		 System.out.println("ABRIL"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==5) {
		 System.out.println("MAIO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==6) {
		 System.out.println("JUNHO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==7) {
		 System.out.println("JULHO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==8) {
		 System.out.println("AGOSTO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==9) {
		 System.out.println("SETEMBRO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==10) {
		 System.out.println("OUTUBRO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==11) {
		 System.out.println("NOVEMBRO"+"/"+DIA+"/"+ANO);
	 }
	 if(MES==12) {
		 System.out.println("DEZEMBRO"+"/"+DIA+"/"+ANO);
	 }
 }
}
