package com.github.sylverena.cloaksandgrimoires.init;

import com.github.sylverena.cloaksandgrimoires.CloaksAndGrimoires;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Class ModItems contains all the initializers for each of the mod's items. Call init() to register all the items
 */
public class ModItems
{
    public static Item BAREBONES_GRIMOIRE;
/*    public static final Item BASIC_GRIMOIRE;
    public static final Item GOLD_GRIMOIRE;*/

    /**
     * Method init() registers all the items to the registry
     */
    public static void init()
    {
        BAREBONES_GRIMOIRE = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "barebones_grimoire"), new Item(new FabricItemSettings()));
    }


}
