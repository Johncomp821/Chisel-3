package com.cricketcraft.chisel.util;

public class BlockVariant implements Comparable<BlockVariant> {
    private int meta;

    private String name;

    public BlockVariant(int meta, String name) {
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return this.meta;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(BlockVariant variant) {
        return this.meta;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
