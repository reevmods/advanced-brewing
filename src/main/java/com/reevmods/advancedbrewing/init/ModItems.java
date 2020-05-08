package com.reevmods.advancedbrewing.init;

import java.util.ArrayList;
import java.util.List;

import com.reevmods.advancedbrewing.items.crops.ItemBarley;
import com.reevmods.advancedbrewing.items.crops.ItemHop;

import net.minecraft.item.Item;

public class ModItems {
	// Items
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Crops
	public static final Item HOP = new ItemHop("hop");
	public static final Item BARLEY = new ItemBarley("barley");
}