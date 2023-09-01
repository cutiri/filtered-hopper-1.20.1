package com.cutiri.filteredhopper.item;

import com.cutiri.filteredhopper.FilteredHopper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // fields region
    //region Fields
    //endregion

    // constructors region
    //region Constructors
    //endregion

    // methods region
    //region Methods

    /*
     * Method to add Item to ingredients
     */
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){

    }

    /*
     * this is a private method that register items
     */
    private static Item registerItem(String name, Item item) {
        //this will register an item with a name that we passed as parameters, then return it back
        return Registry.register(Registries.ITEM, new Identifier(FilteredHopper.MOD_ID, name), item);
    }

    /*
     * this is an exposed method that will trigger the item's registration
     */
    public static void registerModItems(){
        FilteredHopper.LOGGER.info(String.format("Registering Mod Items for %s", FilteredHopper.MOD_ID));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
    //endregion

    // setters and getters region
    //region setters and getters
    //endregion
}
