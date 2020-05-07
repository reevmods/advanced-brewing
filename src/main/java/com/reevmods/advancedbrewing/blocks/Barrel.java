package com.reevmods.advancedbrewing.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

// This Class Inherits BlockBase and extends it'S functions with custom Methods
public class Barrel extends BlockBase{

	// Creates Barrel
	public Barrel(String name, Material material) {
		super(name, material);
		
		// Set's properties
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(2.0f);
		setHarvestLevel("axe", 0);
	}
}