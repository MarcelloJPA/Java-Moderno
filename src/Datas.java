import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now(); // 2021-05-23

		LocalDate olimpiadasDoRio = LocalDate.of(2021, Month.JULY, 25); // 2021-07-25

		int anos = olimpiadasDoRio.getYear() - hoje.getYear(); // faltam 0 anos

		// Trabalhando com Period

		// Diferença de periodo(hoje até as olimpiadas)
		Period periodo = Period.between(hoje, olimpiadasDoRio);

		// Faltam
		periodo.getYears(); // 0 anos
		periodo.getMonths(); // 2 meses
		periodo.getDays(); // 2 dias

		// subtraindo data com minus
		hoje.minusYears(1); // 2020-05-23 -1ano
		hoje.minusMonths(3); // 2021-02-23 -3meses
		hoje.minusDays(20); // 2021-05-03 -20dias

		// Incrementando data com minus
		hoje.plusYears(6); // 2027-05-23 +7 anos
		hoje.plusMonths(4);// 2021-09-23 +4 meses
		hoje.plusDays(50); // 2021-07-12 +50 dias

		// Formatando Datas

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		hoje.format(formatador); // 23/05/2021

		// 2021-05-23T21:58:53.675662100
		LocalDateTime agora = LocalDateTime.now();

		// Formatando
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");

		agora.format(formatadorComHoras); // 23/01/2021 10:01:46
		
		//Modelos Específicos
		
		//Ano e mes
		YearMonth anoEMes = YearMonth.of(2015, Month.APRIL); //2015/04
		YearMonth anoMesAtual = YearMonth.of(hoje.getYear(), hoje.getMonth()); // 2021-05
		
		//Hora e minutos
		LocalTime horaMinutos  = LocalTime.of(12, 33); //12:33
		LocalTime horaMinutosAtual = LocalTime.of(agora.getHour(), agora.getMinute()); //22:15
		
		

	}

}
