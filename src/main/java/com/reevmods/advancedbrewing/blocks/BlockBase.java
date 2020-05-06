package com.reevmods.advancedbrewing.blocks;

import com.reevmods.advancedbrewing.Main;
import com.reevmods.advancedbrewing.init.CreativeTab;
import com.reevmods.advancedbrewing.init.ModBlocks;
import com.reevmods.advancedbrewing.init.ModItems;
import com.reevmods.advancedbrewing.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel{
	
	public BlockBase(String name, Material material) {
		super(material);
	
		// Sets default Block Parameters
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.ADVANCED_BREWING);
		
		// Adds Block to Block and Item List
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}