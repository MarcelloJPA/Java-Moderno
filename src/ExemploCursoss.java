import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursoss {

	public static void main(String[] args) {

		List<Cursos> cursos = new ArrayList<>();
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("Javascript", 150));
		cursos.add(new Cursos("Java 8", 113));
		cursos.add(new Cursos("C", 55));

		Stream<Cursos> streamCurso = cursos.stream().filter(c -> c.getAlunos() > 100);

		/* Ordene pela Quantidade de alunos */
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		System.out.println(cursos);
		System.out.println("==============================================");

		/* Filtrando cursos com mais de 50 alunos */
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(x -> System.out.println(x));
		System.out.println("==============================================");

		/* Transforme o Stream<Curso> em um Stream<String> */
		Stream<String> streamString = cursos.stream().map(c -> c.getNome());
		streamString.forEach(x -> System.out.println(x));
		System.out.println("==============================================");

		/*
		 * O código a seguir cria um Stream<Integer> com a quantidade de alunos dos
		 * cursos e em seguida imprime todos eles.
		 */
		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getAlunos()).forEach(x -> System.out.println(x));
		System.out.println("==============================================");
		/* Faça a mesma coisa utilizando method reference */
		cursos.stream().filter(c -> c.getAlunos() > 50).map(Cursos::getAlunos).forEach(System.out::println);
		System.out.println("==============================================");
		
		
		/*findAny -> Localiza qualquer elemento no fluxo com as 
		 * operações intermediárias anteriores(filter)
		 * ifPresent ->	Se o valor está present OK, se não não retorna nada*/
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		
		/*Transformando um stream em uma coleção e atribuindo para a Lista do inicio*/
		
		 cursos = cursos.stream()	
				.filter(c -> c.getAlunos() > 0 )
				.collect(Collectors.toList());
		
		System.out.println(cursos);
		
		
		/*Na aula anterior fizemos um filtro para pegar todos os cursos
		 *  com mais de 50 alunos:*/
		
		/*Como podemos fazer pra pegar o primeiro elemento desse Stream filtrado?*/
			System.out.println(cursos.stream()
					   .filter(c -> c.getAlunos() > 50)
					   .findFirst());
			
			/*Calcule a media de todos somando todos os cursos*/
			
		System.out.println(cursos.stream().mapToInt(c -> c.getAlunos()).average());	
		
		
		
		/*Depois de filtrar todos os cursos com mais de 50 alunos, 
		temos um Stream<Curso> como resultado:*/
		
		Stream<Cursos> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		
		/*Como podemos transformar esse Stream<Curso> 
		 * filtrado em uma List<Curso>?*/
		
		List<Cursos> streamEmList = stream.collect(Collectors.toList());
		System.out.println(streamEmList);
	}

}

class Cursos {
	private String nome;
	private int alunos;

	public Cursos(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;

	}

	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return nome + " " + alunos;
	}

}
