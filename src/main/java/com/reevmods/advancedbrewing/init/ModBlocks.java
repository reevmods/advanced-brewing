package com.reevmods.advancedbrewing.init;

import java.util.ArrayList;
import java.util.List;

import com.reevmods.advancedbrewing.blocks.Barrel;
import com.reevmods.advancedbrewing.blocks.crops.BarleyPlant;
import com.reevmods.advancedbrewing.blocks.crops.HopPlant;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();	
	
	// Functional Blocks
	public static final Block BARREL = new Barrel("barrel", Material.WOOD);
	
	// Crops
	public static final Block HOP_PLANT = new HopPlant("hop_plant");	
	public static final Block BARLEY_PLANT = new BarleyPlant("barley_plant");	
}