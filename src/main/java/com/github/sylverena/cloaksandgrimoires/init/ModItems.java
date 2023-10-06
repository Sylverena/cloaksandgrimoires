package com.github.sylverena.cloaksandgrimoires.init;

import com.github.sylverena.cloaksandgrimoires.CloaksAndGrimoires;
import com.github.sylverena.cloaksandgrimoires.items.CloakItem;
import com.github.sylverena.cloaksandgrimoires.items.EnchantedClothItem;
import com.github.sylverena.cloaksandgrimoires.items.GrimoireItem;
import com.github.sylverena.cloaksandgrimoires.items.WandItem;
import com.github.sylverena.cloaksandgrimoires.materials.EnchantedClothMaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * Class ModItems contains all the initializers for each of the mod's items. Call init() to register all the items
 */
public class ModItems
{
    public static ArmorMaterial enchantedClothArmorMaterial = new EnchantedClothMaterial();

    public static GrimoireItem BAREBONES_GRIMOIRE;
    public static WandItem BASIC_WAND;
    public static EnchantedClothItem ENCHANTED_CLOTH;
    public static CloakItem BASIC_CLOAK;

    /**
     * This Itemgroup should house all the items
     */
    private static final ItemGroup CLOAKS_AND_GRIMOIRES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BAREBONES_GRIMOIRE))
            .displayName(Text.translatable("itemgroup.cloaksandgrimoires.cloaksandgrimoires_group"))
            .entries((displayContext, entries) ->  {// All items should be added here
                    entries.add(BAREBONES_GRIMOIRE);
                    entries.add(BASIC_WAND);
                    entries.add(BASIC_CLOAK);
                    entries.add(ENCHANTED_CLOTH);
                })
            .build();

    /**
     * Method init() registers all the items to the registry
     */
    public static void init()
    {
        Registry.register(Registries.ITEM_GROUP, new Identifier(CloaksAndGrimoires.MODID, "cloaksandgrimoires_group"), CLOAKS_AND_GRIMOIRES_GROUP);

        ENCHANTED_CLOTH = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "enchanted_cloth"), new EnchantedClothItem(new FabricItemSettings().maxCount(32)));

        BAREBONES_GRIMOIRE = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "barebones_grimoire"), new GrimoireItem(new FabricItemSettings().maxCount(1)));
        BASIC_WAND = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "basic_wand"), new WandItem(new FabricItemSettings().maxCount(1)));
        BASIC_CLOAK = Registry.register(Registries.ITEM, new Identifier(CloaksAndGrimoires.MODID, "basic_cloak"), new CloakItem(ArmorMaterials.LEATHER, Type.CHESTPLATE, new FabricItemSettings()));
    }


}
