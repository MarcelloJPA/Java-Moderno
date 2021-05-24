import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodDefaultComparator {

	public static void main(String[] args) {
		
			List<String> palavras = new ArrayList<String>();
			palavras.add("alura online");
			palavras.add("casa do código");
			palavras.add("caelum");
			System.out.println(palavras);
			
			/*Ordenando pelo tamanho das strings*/ /*Methods Default em Comparator*/
			palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
			System.out.println(palavras);
			
			//Para cada string pega o tamanho
			Function<String, Integer> funcao = s -> s.length();
			
			//Method Default comparing: comparador fará comparação por tamanho
			Comparator<String> comparador = Comparator.comparing(funcao);
			
			//ordena com o comparador(menor para o maior string)
			palavras.sort(comparador);
			
			//Forma reduzida -> Method reference
			palavras.sort(Comparator.comparing(String::length));
	}

}
