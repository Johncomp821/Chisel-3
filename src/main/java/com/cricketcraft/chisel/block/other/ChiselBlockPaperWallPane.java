package com.cricketcraft.chisel.block.other;

import com.cricketcraft.chisel.block.BlockCarvable;
import com.cricketcraft.chisel.init.ChiselProperties;
import com.cricketcraft.chisel.init.ChiselTabs;
import com.cricketcraft.chisel.util.BlockVariant;
import com.cricketcraft.chisel.util.IChiselBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ChiselBlockPaperWallPane extends BlockCarvable implements IChiselBlock {
    public ChiselBlockPaperWallPane() {
        super(Material.wood);
        setCreativeTab(ChiselTabs.tabOtherChiselBlocks);
        //TODO: Make this function like a pane
        setDefaultState(this.getBlockState().getBaseState().withProperty(ChiselProperties.PAPERWALL_VARIANTS, ChiselProperties.PAPERWALL_VARIANTS.fromMeta(0)));
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (BlockVariant variant : ChiselProperties.PAPERWALL_VARIANTS.getAllowedValues()) {
            list.add(new ItemStack(itemIn, 1, variant.getMeta()));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(ChiselProperties.PAPERWALL_VARIANTS, ChiselProperties.PAPERWALL_VARIANTS.fromMeta(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((BlockVariant) state.getValue(ChiselProperties.PAPERWALL_VARIANTS)).getMeta();
    }

    @Override
    public String getSubtypeUnlocalizedName(ItemStack stack) {
        return ChiselProperties.PAPERWALL_VARIANTS.fromMeta(stack.getMetadata()).getName();
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, ChiselProperties.PAPERWALL_VARIANTS);
    }
}
