package com.teamnotsobad.modpack.blocks;

import com.teamnotsobad.modpack.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UtilityBlock extends Block {
    public UtilityBlock() {
        super(Material.ROCK);
        setUnlocalizedName(Main.MODID + ".utilityBlock");     // Used for localization (en_US.lang)
        setRegistryName("utilityBlock");        // The unique name (within your mod) that identifies this block
    }
}