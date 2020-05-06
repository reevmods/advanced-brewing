package com.reevmods.advancedbrewing.init;

import java.util.ArrayList;
import java.util.List;

import com.reevmods.advancedbrewing.blocks.Barrel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();	
	
	// Functional Blocks
	public static final Block BARREL = new Barrel("barrel", Material.WOOD);
}