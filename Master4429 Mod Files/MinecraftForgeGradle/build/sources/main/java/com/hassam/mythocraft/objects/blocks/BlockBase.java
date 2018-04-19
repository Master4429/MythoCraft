package com.hassam.mythocraft.objects.blocks;

import com.hassam.mythocraft.Main;
import com.hassam.mythocraft.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBase extends Block {
	public Item itemBlock = null;
	public boolean isOpaqueCube = true, isFullCube = true;
	public BlockRenderLayer layer = BlockRenderLayer.SOLID;
	public BlockBase(Material materialIn, String name, boolean addToTab) {
		super(materialIn);
	}

	public BlockBase setIsOpaqueCube(boolean b) {
		isOpaqueCube = b;
		return this;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return isOpaqueCube;
	}

	public BlockBase setIsFullCube(boolean b) {
		isFullCube = b;
		return this;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return isFullCube;
	}

	@Override
	public boolean isFullBlock(IBlockState state) {
		return isFullCube;
	}

	public BlockBase setHarvestProperties(String toolType, int level) {
		super.setHarvestLevel(toolType, level);
		return this;
	}
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
	}
}