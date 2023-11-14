package com.github.sylverena.cloaksandgrimoires.spells;

import net.minecraft.text.Text;

public abstract class UnaspectedSpell extends GrimoireSpell {
    public UnaspectedSpell(double baseCost, Text spellID, Text description, int tier) {
        super(baseCost, spellID, description, tier);
    }
}
