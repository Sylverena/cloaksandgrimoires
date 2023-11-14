package com.github.sylverena.cloaksandgrimoires.spells;

import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;

public class Forcebolt extends UnaspectedSpell implements DamageSpellEffect{

    public Forcebolt() {
        super(5, Text.translatable("cloaksandgrimoires.spell.unaspected.name.forcebolt"),
                Text.translatable("cloaksandgrimoires.spell.unaspected.description.forcebolt"), 0);
    }

    @Override
    public void cast() {
        // todo i think this should do all the math and particle effects for projectiles
    }

    @Override
    public void apply(LivingEntity caster, double damage) {
        // todo I think this should actually do the effects of the spell
    }
}