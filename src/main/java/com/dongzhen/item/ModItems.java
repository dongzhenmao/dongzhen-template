package com.dongzhen.item;

import com.dongzhen.Dongzhen;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item register_my_Item(String id, Item item) { // 照抄源代码改
        return Registry.register(Registries.ITEM, Identifier.of(Dongzhen.MOD_ID, id), item);
    }

    public static final Item NETHERITE_CARROT = register_my_Item("netherite_carrot", new Item(new Item.Settings()));

    public static void register_MOD_Items() {
        Dongzhen.LOGGER.info("go go go");
    }

}
