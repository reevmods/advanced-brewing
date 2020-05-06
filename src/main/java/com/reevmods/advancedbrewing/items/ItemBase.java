package com.reevmods.advancedbrewing.items;

import com.reevmods.advancedbrewing.Main;
import com.reevmods.advancedbrewing.init.CreativeTab;
import com.reevmods.advancedbrewing.init.ModItems;
import com.reevmods.advancedbrewing.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.ADVANCED_BREWING);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}
	
}