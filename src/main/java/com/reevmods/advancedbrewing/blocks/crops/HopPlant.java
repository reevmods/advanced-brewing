package com.reevmods.advancedbrewing.blocks.crops;

import com.reevmods.advancedbrewing.init.CreativeTab;
import com.reevmods.advancedbrewing.init.ModBlocks;
import com.reevmods.advancedbrewing.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class HopPlant extends BlockCrops implements IGrowable{
	
	protected static final AxisAlignedBB[] hops = new AxisAlignedBB[] {
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,0.125D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,0.25D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,0.375D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,0.5525D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,0.8125D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,1.0D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,1.0D,1.0D),
			new AxisAlignedBB(0.0D,0.0D,0.0D,1.0D,1.0D,1.0D)};
	
	public HopPlant(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTab.ADVANCED_BREWING);
		
		ModBlocks.BLOCKS.add(this);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			if(this.isMaxAge(state)) {
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.HOP, 2)));
				worldIn.setBlockState(pos, this.withAge(0));
				return true;
			}
		}
		return false;
	}
	
	protected Item getSeed() {
		return ModItems.HOP;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.HOP;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return hops[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
}