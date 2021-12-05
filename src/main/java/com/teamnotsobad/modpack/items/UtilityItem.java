package com.teamnotsobad.modpack.items;

import com.teamnotsobad.modpack.Main;
import net.minecraft.item.Item;

public class UtilityItem extends Item {

    public UtilityItem() {
        setRegistryName("utilityitem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(Main.MODID + ".utilityitem");     // Used for localization (en_US.lang)
    }

}
