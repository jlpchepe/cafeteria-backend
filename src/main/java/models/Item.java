package models;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Representa un artículo
 * @author Jose
 *
 */
public class Item {
    private final String name;
    private final String description;
    private final String imageSource;
    private final BigDecimal price;
    /**
     * Extras con los que puede solicitarse el artículo actual
     */
	private Collection<String> extras;
    
	public Item(
		String name, 
		String description, 
		String imageSource, 
		BigDecimal price,
		Collection<String> extras
	) {
		super();
		this.name = name;
		this.description = description;
		this.imageSource = imageSource;
		this.price = price;
		this.extras = extras;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImageSource() {
		return imageSource;
	}

	public BigDecimal getPrice() {
		return price;
	}
}