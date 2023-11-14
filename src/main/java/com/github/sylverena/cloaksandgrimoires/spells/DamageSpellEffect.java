package com.github.sylverena.cloaksandgrimoires.spells;

import net.minecraft.entity.LivingEntity;

public interface DamageSpellEffect{
    void apply(LivingEntity caster, double damage);
}
