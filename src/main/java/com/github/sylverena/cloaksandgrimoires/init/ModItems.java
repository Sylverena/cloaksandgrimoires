package com.github.sylverena.cloaksandgrimoires.init;

import com.github.sylverena.cloaksandgrimoires.CloaksAndGrimoires;
import com.github.sylverena.cloaksandgrimoires.items.GrimoireItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * Class ModItems contains all the initializers for each of the mod's items. Call init() to register all the items
 */
public class ModItems
{
    public static GrimoireItem BAREBONES_GRIMOIRE;

    /**
     * This Itemgroup should house all the items
     */
    private static final ItemGroup CLOAKS_AND_GRIMOIRES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BAREBONES_GRIMOIRE))
            .displayName(Text.translatable("itemgroup.cloaksandgrimoires.cloaksandgrimoires_group"))
            .entries(((displayContext, entries) ->
                    entries.add(BAREBONES_GRIMOIRE)))
            .build();

    /**
     * Method init() registers all the items to the registry
     */
    public static void init()
    {
        Registry.register(Registries.ITEM_GROUP, new Identifier(CloaksAndGrimoires.MODID, "cloaksandgrimoires_group"), CLOAKS_AND_GRIMOIRES_GROUP);

        BAREBONES_GRIMOIRE = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "barebones_grimoire"), new GrimoireItem(new FabricItemSettings()));
    }


}
