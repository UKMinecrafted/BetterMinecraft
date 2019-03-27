package com.ukminecrafted.betterminecraft.common.items;

import com.ukminecrafted.betterminecraft.Main;
import com.ukminecrafted.betterminecraft.init.ModItems;
import com.ukminecrafted.betterminecraft.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(Main.item);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}