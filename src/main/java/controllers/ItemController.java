package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Item;
import services.ItemService;

@RestController
@RequestMapping("api/item")
public class ItemController {
	public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}

	private final ItemService itemService;

    @GetMapping
    public List<Item> getAll() {
        return this.itemService.getAll();
    }
}
