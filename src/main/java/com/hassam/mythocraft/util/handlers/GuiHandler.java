package com.hassam.mythocraft.util.handlers;


import com.hassam.mythocraft.Reference;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;

import net.minecraftforge.fml.common.network.IGuiHandler;



public class GuiHandler implements IGuiHandler

{

	@Override

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)

	{
		return null;
	}



	@Override

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 

	{
		return null;
	}



}