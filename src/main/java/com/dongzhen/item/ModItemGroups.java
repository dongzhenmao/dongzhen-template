package com.dongzhen.item;

import com.dongzhen.Dongzhen;
import com.dongzhen.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DONGZHEN_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Dongzhen.MOD_ID, "dongzhen_group"),
            ItemGroup.create(ItemGroup.Row.TOP, -1)
                    .displayName(Text.translatable("itemGroup.dongzhen_group"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_CARROT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NETHERITE_CARROT);
                        entries.add(ModBlocks.CARROT_BLOCK);
                    }).build());

    public static void register_my_group() {
        Dongzhen.LOGGER.info("I'm registering the group!");
    }
}