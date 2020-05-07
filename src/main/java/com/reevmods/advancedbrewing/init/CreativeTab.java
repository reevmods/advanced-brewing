package com.reevmods.advancedbrewing.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Steev
 * Creates Creative Tab 
 * can be set by using CreativeTab.<Dfinition>
 */

public class CreativeTab {
	// Defines the tab as Definition
	public static final CreativeTabs ADVANCED_BREWING = (new CreativeTabs("advanced_brewing") {
		
		// Overrides the Tabs Icon
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.BARREL);
		}
		
		// Does the Tab have a SearchBar?
		@Override
		public boolean hasSearchBar() {
			// In this case the Tab does
			return true;
		}
	}.setBackgroundImageName("item_search.png"));
}