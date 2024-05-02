package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		
		//FUNCTION implementacao da interface
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //aplica a funcao para cada eelemnto, produz outra lista
//		names.forEach(System.out::println);
		
		//FUNCTION reference method com metodo estatico
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); //aplica a funcao para cada eelemnto, produz outra lista
//		names.forEach(System.out::println);
		
		//FUNCTION reference method com metodo nao estatico
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); //aplica a funcao para cada eelemnto, produz outra lista
//		names.forEach(System.out::println);
		
		//FUNCTION expressao lambda declarada
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList()); //aplica a funcao para cada eelemnto, produz outra lista
//		names.forEach(System.out::println);
		
		//FUNCATION expressao lambda inline
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //aplica a funcao para cada eelemnto, produz outra lista
		names.forEach(System.out::println);
	}

}
