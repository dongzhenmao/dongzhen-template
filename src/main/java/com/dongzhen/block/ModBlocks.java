package com.dongzhen.block;

import com.dongzhen.Dongzhen;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
//new BlockItem(block, new Item.Settings())
public class ModBlocks {
    private static void register_block_item(String id, Block block) { // 照抄源代码改
        Item item = Registry.register(Registries.ITEM, Identifier.of(Dongzhen.MOD_ID, id), new BlockItem(block, new Item.Settings()));

        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Dongzhen.MOD_ID, id), block);
    }

    public static final Block STONE = register(
            "stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F))
    );
}
