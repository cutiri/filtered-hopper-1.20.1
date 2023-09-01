package com.cutiri.filteredhopper.block;

import com.cutiri.filteredhopper.FilteredHopper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // fields region
    //region Fields

    // This is the Filtered Hopper Block
    public static final Block FILTERED_HOPPER = registerBlock("filtered_hopper",
            new Block(FabricBlockSettings.copyOf(Blocks.HOPPER)));
    //endregion

    // constructors region
    //region Constructors
    //endregion

    // methods region
    //region Methods
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FilteredHopper.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FilteredHopper.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks(){
        FilteredHopper.LOGGER.info("Registering ModBlocks for " + FilteredHopper.MOD_ID);

        //We register the FILTERED_HOPPER inside the REDSTONE Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register( content -> { content.add(FILTERED_HOPPER); } );

    }
    //endregion

    // setters and getters region
    //region setters and getters
    //endregion
}
