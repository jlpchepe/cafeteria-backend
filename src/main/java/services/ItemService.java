package services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import models.Item;

/**
 * Servicio encargado de entregar artículos
 * @author Jose
 *
 */
@Service
public class ItemService {
	public List<Item> getAll(){
		return generateMocks();
	}
	
	private List<Item> generateMocks() {
		Supplier<List<Item>> fiveGenerator = () ->
			Arrays.asList(
				new Item(
					"Hamburguer",
					"Tasty hamburguer with onion",
					"https://images.unsplash.com/photo-1551615593-ef5fe247e8f7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1380&q=80",
					BigDecimal.valueOf(50)
				),
				new Item(
					"Pizza",
					"Delicious italian cheese pizza",
					"https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=1355&q=80",
					BigDecimal.valueOf(40)
				),
				new Item(
					"Sandwich",
					"Delicious italian cheese hamburguer",
					"https://images.unsplash.com/photo-1521390188846-e2a3a97453a0?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
					BigDecimal.valueOf(35)
				),
				new Item(
					"Salad",
					"Delicious salad",
					"https://images.unsplash.com/photo-1543339308-43e59d6b73a6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
					BigDecimal.valueOf(60)
				),
				new Item(
					"French fries",
					"Salty french fries",
					"https://images.unsplash.com/photo-1463183665146-ce2ed31df6b0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
					BigDecimal.valueOf(20)
				)
			);
			
		return Arrays.asList(new Integer[20])
			.stream()
			.flatMap(i -> fiveGenerator.get().stream())
			.collect(Collectors.toList());
	}
}
