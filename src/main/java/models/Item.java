package models;

import java.math.BigDecimal;

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
    
	public Item(String name, String description, String imageSource, BigDecimal price) {
		super();
		this.name = name;
		this.description = description;
		this.imageSource = imageSource;
		this.price = price;
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