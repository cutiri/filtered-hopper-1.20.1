package com.cutiri.filteredhopper.item;

import com.cutiri.filteredhopper.FilteredHopper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.logging.Filter;

public class ModItemGroups {
    // fields region
    //region Fields

    //Here we can create an Item group:
    /*public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        // in here we can add the items we want inside the group
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(Items.DIAMOND);
                        entries.add(Items.IRON_INGOT);
                        entries.add(Items.GOLD_INGOT);

                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());*/

    //endregion

    // constructors region
    //region Constructors
    //endregion

    // methods region
    //region Methods
    public static void registerItemsGroup(){
        FilteredHopper.LOGGER.info("Registering Item Groups for " + FilteredHopper.MOD_ID);
    }
    //endregion

    // setters and getters region
    //region setters and getters
    //endregion
}
