import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

//    Exercício 1
//    A partir de uma lista de inteiros, filtre e retorne uma lista com apenas os números pares da coleção.
    ArrayList<Integer> numbers = new ArrayList<Integer>();
//
    for (int i = 0 ; i < 10; i++){
      numbers.add(i+1);
    }

    System.out.println("Exercício 1");
    System.out.println("Lista original: " + numbers);

    String numbersFilters =  numbers.stream()
      .filter(num-> num %2 == 0).toList().toString();

    System.out.println("Lista filtrada: " + numbersFilters);


//    Exercício 2
//    A partir de uma lista de Strings, filtre e retorne uma lista com todas elas em caixa alta.

    List<String> wordList = Arrays.asList("João","Maria","Pedro","Rosa");
    List<String> wordListUpper = wordList.stream().map(String::toUpperCase).toList();
    System.out.println("Exercício 2");
    System.out.println("Lista original: " + wordList);
    System.out.println("Lista em caixa alta: " + wordListUpper);


//    Exercício 3
//    Calcule e imprima a soma de todos os números em uma lista de números.
      List<Integer> numberList = Arrays.asList(5,5);
      int sum = numberList.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Exercício 3");
      System.out.println("Lista original: " + numberList);
      System.out.println("Soma dos números: " + sum);

//    Exercício 4
//    A partir de uma lista de Strings e de um número a ser passado por parâmetro
//    retorne uma nova lista com todas as Strings que possuem
//    uma quantidade de caracteres maior que o número passado.
    System.out.println(functionExercicio4(3));

  }

  public static List<String> functionExercicio4(int numberCharacters) {
    List<String> stringList = Arrays.asList("Lu", "Lucas", "Alexandre", "Constantino", "Hipertextualização");

    return stringList.stream()
      .filter(string -> string.length() > numberCharacters)
      .toList();
  }
}
