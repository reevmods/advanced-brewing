package com.reevmods.advancedbrewing.init;

import java.util.ArrayList;
import java.util.List;

import com.reevmods.advancedbrewing.items.ItemBase;
import com.reevmods.advancedbrewing.items.crops.ItemBarley;
import com.reevmods.advancedbrewing.items.crops.ItemHop;

import net.minecraft.item.Item;

public class ModItems {
	// Items
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Crops
	public static final Item HOP = new ItemBase("hop");
	public static final Item BARLEY = new ItemBase("barley");
	public static final Item HOP_SEED = new ItemHop("hop_seed");
	public static final Item BARLEY_SEED = new ItemBarley("barley_seed");
}