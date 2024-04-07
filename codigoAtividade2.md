package aulaDatasisso;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o dia:");
		int dia = teclado.nextInt();
		System.out.println("Informe o mês:");
		int mes = teclado.nextInt();
		System.out.println("Informe o ano:");
		int ano = teclado.nextInt();
		contaTempo(dia, mes, ano);
		
		teclado.close();
		

	}
	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate hoje = LocalDate.now();
		LocalDate vira = LocalDate.of(ano, mes, dia);
		Period periodo = Period.between(hoje, vira);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		System.out.println("Faltam " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s) para essa data em " + ano + ".");
	}
}
