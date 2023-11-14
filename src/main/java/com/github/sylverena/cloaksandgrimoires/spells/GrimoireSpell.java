package com.github.sylverena.cloaksandgrimoires.spells;

import net.minecraft.text.Text;

//todo javadoc, subclasses
public abstract class GrimoireSpell implements Castable{
    private final double baseCost;

    private final Text spellID;

    private final Text description;

    private final int tier;

    public double getBaseCost() {
        return baseCost;
    }

    public Text getSpellID() {
        return spellID;
    }

    public Text getDescription() {
        return description;
    }

    public int getTier() {
        return tier;
    }

    // todo does this need to be a functional interface?
    public abstract void cast();

    public GrimoireSpell(double baseCost, Text spellID, Text description, int tier) {
        this.baseCost = baseCost;
        this.spellID = spellID;
        this.description = description;
        this.tier = tier;
    }
}
