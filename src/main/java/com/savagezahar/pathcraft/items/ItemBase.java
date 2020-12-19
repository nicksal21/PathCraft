package com.savagezahar.pathcraft.items;

import com.savagezahar.pathcraft.Pathcraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Pathcraft.PATHCRAFT_ITEMS));
    }

    public ItemBase(Item.Properties builder) {
        super(builder);
    }
}
