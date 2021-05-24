import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicios {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		System.out.println(palavras);
		
		//Modifique a forma que estamos fazendo o sort 
		//das palavras utilizando o Comparator.comparing().
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length()); 
		});
		
		//Resposta
		palavras.sort(Comparator.comparing(s -> s.length()));

		//Muda o Lambda acima para method reference
		//R:
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println("Oi");
	}

}
