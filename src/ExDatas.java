import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class ExDatas {

	public static void main(String[] args) {
		//Crie um LocalDate para representar o dia 25 de Janeiro de 2099.


		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		
		//Como criar um período entre hoje 
		//e a data que você criou no exercício anterior?
		LocalDate hoje = LocalDate.now();
		
		Period tempoQueFalta = Period.between(hoje, data);
		
		System.out.println(tempoQueFalta.getYears()); //77 anos
		System.out.println(tempoQueFalta.getMonths()); //8 meses
		System.out.println(tempoQueFalta.getDays()); //2 dias
		
		//Crie um formatador para o pattern dd/MM/yyyy e 
		//imprima a data de hoje formatada.
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		
		System.out.println(hoje.format(formatador)); // 23/05/2021
	}

}
