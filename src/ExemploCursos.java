import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
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
		
		return nome;
	}
}

public class ExemploCursos {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		System.out.println(cursos);
		
		/*Organiza a lista pela comparação de inteiros*/
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		System.out.println(cursos);
		
		/*Isso não impacta na Coleção original*/
		Stream<Curso> streamCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		/*Impactou somente aqui no stream*/
		streamCurso.forEach(c -> System.out.println(c.getNome()));
		
		/* filter() : Dos cursos com alunos > 100  
		 * map() :  */
		cursos.stream().filter(c -> c.getAlunos() > 100).map(c -> c.getAlunos()).forEach(x -> System.out.println(x));
		
		
			
	}
}
