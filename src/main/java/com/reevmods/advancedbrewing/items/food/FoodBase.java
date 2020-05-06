package com.reevmods.advancedbrewing.items.food;

import com.reevmods.advancedbrewing.Main;
import com.reevmods.advancedbrewing.init.CreativeTab;
import com.reevmods.advancedbrewing.init.ModItems;
import com.reevmods.advancedbrewing.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount,saturation, isAnimalFood);
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