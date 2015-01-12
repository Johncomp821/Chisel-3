package com.cricketcraft.chisel.init;

import com.cricketcraft.chisel.block.*;
import net.minecraft.block.Block;

import com.cricketcraft.chisel.Chisel;

import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Chisel.MOD_ID)
public final class ChiselBlocks {

	public static final Block autoChisel = null;
	public static final BlockCarvable antiBlock = null;
	public static final BlockCarvable marble = null;
	public static final BlockCarvable marble_pillar = null;
	public static final BlockCarvable limestone = null;
	public static final BlockCarvableSlab marble_slab = null;
	public static final BlockCarvableSlab limestone_slab = null;
	public static final BlockCarvableSlab marble_pillar_slab = null;
	public static final BlockCarvable cobblestone = null;
	public static final BlockMarbleWall cobblestoneWall = null;
	public static final BlockCarvableGlass glass = null;
	public static final BlockCarvablePane glass_pane = null;
	public static final BlockCarvable sandstone = null;
	public static final BlockCarvable sandstone_scribbles = null;
	public static final BlockConcrete concrete = null;
	public static final BlockRoadLine road_line = null;
	public static final BlockCarvable iron_block = null;
	public static final BlockCarvable gold_block = null;
	public static final BlockCarvable diamond_block = null;
	public static final BlockLightstoneCarvable glowstone = null;
	public static final BlockCarvable lapis_block = null;
	public static final BlockCarvable emerald_block = null;
	public static final BlockCarvable nether_brick = null;
	public static final BlockCarvable netherrack = null;
	public static final BlockCarvable mossy_cobblestone = null;
	public static final BlockCarvable stonebricksmooth = null;
	public static final BlockCarvableStairs marbleStairs = null;
	public static final BlockCarvableStairs limestoneStairs = null;
	public static final BlockCarvablePane iron_bars = null;
	public static final BlockMarbleIce ice = null;
	public static final BlockMarbleIce ice_pillar = null;
	public static final BlockMarblePackedIce packedice = null;
	public static final BlockMarblePackedIce packedice_pillar = null;
	public static final BlockMarbleIceStairs iceStairs = null;
	public static final BlockMarblePackedIceStairs packediceStairs = null;
	public static final BlockCarvable obsidian = null;
	public static final BlockCarvablePowered redstone_block = null;
	public static final BlockHolystone holystone = null;
	public static final BlockGrimstone grimstone = null;
	public static final BlockLavastone lavastone = null;
	public static final BlockWaterstone waterstone = null;
	public static final BlockCarvable leaves = null;
	public static final BlockCarvable fantasyblock = null;
	public static final BlockCarvable fantasyblock2 = null;
	public static final BlockCarvable carpet_block = null;
	public static final BlockMarbleCarpet carpet = null;
	public static final BlockCarvable bookshelf = null;
	public static final BlockCarvable tyrian = null;
	public static final BlockCarvable dirt = null;
	public static final BlockCloud cloud = null;
	public static final BlockCarvable templeblock = null;
	public static final BlockCarvable mossy_templeblock = null;
	public static final BlockCarvable factoryblock = null;
	public static final BlockCarvablePane paperwall = null;
	public static final BlockCarvable woolen_clay = null;
	public static final BlockCarvable laboratoryblock = null;

	public static final BlockCarvable voidstone = null;
	public static final BlockMarbleTexturedOre voidstone2 = null;
	public static final BlockVoidstonePillar voidstonePillar = null;
	public static final BlockVoidstonePillar2 voidstonePillar2 = null;
	public static final BlockSnakestone stone_snakestone = null;
	public static final BlockSnakestone sand_snakestone = null;
	public static final BlockSnakestoneObsidian obsidian_snakestone = null;
	public static final BlockCarvable hexPlating = null;
	public static final BlockCarvable technical = null;
	public static final BlockCarvableGlass technical2 = null;
	public static final BlockCarvable futura = null;
	public static final BlockCarvable bone = null;
	public static final BlockCarvable scorching = null;
	public static final BlockCarvable brickCustom = null;
	public static final BlockCarvable sign = null;
	public static final BlockCarvable arcane = null;
	public static final BlockCarvable bloodRune = null;
	public static final BlockCarvableSand colored_sand = null;

	// Arrays can't be final because of how @ObjectHolder works
	public static BlockCarvable[] planks = new BlockCarvable[6];

	public static BlockPresent[] present = new BlockPresent[16];

	public static BlockCarvablePumpkin[] pumpkin = new BlockCarvablePumpkin[16];
	public static BlockCarvablePumpkin[] jackolantern = new BlockCarvablePumpkin[16];

	// 1.7
	public static BlockCarvableGlass[] stainedGlass = new BlockCarvableGlass[4];
	public static BlockCarvablePane[] stainedGlassPane = new BlockCarvablePane[8];

	// 1.8 or at least so you think :P
	public static final BlockCarvable granite = null;
	public static final BlockCarvable diorite = null;
	public static final BlockCarvable andesite = null;

	private ChiselBlocks() {
	}
}