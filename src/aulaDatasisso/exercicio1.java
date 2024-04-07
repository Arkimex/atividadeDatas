package aulaDatasisso;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exercicio1 {

	public static void main(String[] args) {
		System.out.println(obterDataFormatada());
	}
		
		
		public static String obterDataFormatada() {
		SimpleDateFormat dia = new SimpleDateFormat("EEEE");
		SimpleDateFormat numDia = new SimpleDateFormat("dd");
		SimpleDateFormat mes = new SimpleDateFormat("MMMM");
		SimpleDateFormat ano = new SimpleDateFormat("y");
		SimpleDateFormat horas = new SimpleDateFormat("HH");
		SimpleDateFormat minutos = new SimpleDateFormat("m");
			
		Date data1= new Date();
		return "Hoje é " + dia.format(data1) + ", dia " + numDia.format(data1) + 
		" de " + mes.format(data1) + " de " + ano.format(data1) + " e agora são " + 
		horas.format(data1) + " horas e " + minutos.format(data1) + " minutos";
		}	
	
	
}
