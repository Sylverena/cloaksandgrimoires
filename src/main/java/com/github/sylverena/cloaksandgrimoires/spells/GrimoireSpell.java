package com.github.sylverena.cloaksandgrimoires.spells;

import net.minecraft.text.Text;

//todo javadoc, subclasses
public abstract class GrimoireSpell {
    private final double baseCost;

    private final Text spellID;

    private final Text description;

    public double getBaseCost() {
        return baseCost;
    }

    public Text getSpellID() {
        return spellID;
    }

    public Text getDescription() {
        return description;
    }

    // todo does this need to be a functional interface?
    public abstract void cast();

    public GrimoireSpell(double baseCost, String spellID, String description)
    {
        this.baseCost = baseCost;
        this.spellID = Text.translatable(spellID);
        this.description = Text.translatable(description);
    }
}
