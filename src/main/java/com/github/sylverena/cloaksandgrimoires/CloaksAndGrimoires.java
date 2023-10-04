package com.github.sylverena.cloaksandgrimoires;

import com.github.sylverena.cloaksandgrimoires.init.*;

/**
 * Class CloaksAndGrimoires serves as the main entry point to the mod and calls all initializes
 * using the implemented onInitialize
 */
public class CloaksAndGrimoires implements net.fabricmc.api.ModInitializer
{
    public static final String MODID = "cloaksandgrimoires";
    @Override
    public void onInitialize()
    {

        ModItems.init();
    }
}
