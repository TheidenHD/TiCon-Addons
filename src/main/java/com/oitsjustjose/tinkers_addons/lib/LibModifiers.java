package com.oitsjustjose.tinkers_addons.lib;

import com.oitsjustjose.tinkers_addons.TinkersAddons;
import com.oitsjustjose.tinkers_addons.modifiers.ModAutoRepair;
import com.oitsjustjose.tinkers_addons.modifiers.ModExtraModifier;

import c4.conarm.lib.ArmoryRegistry;
import c4.conarm.lib.utils.RecipeMatchHolder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class LibModifiers
{
    public Modifier auto_repair;
    public Modifier extra_modifier_lvl1;
    public Modifier extra_modifier_lvl2;
    public Modifier extra_modifier_lvl3;
    public Modifier extra_modifier_lvl4; 

    public LibModifiers()
    {
    	NonNullList<ItemStack> subtypes = NonNullList.create();
    	TinkersAddons.modItems.MODIFIERS.getSubItems(TinkersAddons.modItems.MODIFIERS.getCreativeTab(), subtypes);
    	boolean armor = Loader.isModLoaded("conarm");
        if (TinkersAddons.modConfig.enableAmelioration)
        {
            auto_repair = new ModAutoRepair();
            if (armor)
            {
            	ArmoryRegistry.registerModifier(auto_repair.getIdentifier(), auto_repair);
            	RecipeMatchHolder.addItem(auto_repair, subtypes.get(0), 1, 1);
            }
        }
        if (TinkersAddons.modConfig.enableExtraModifierLvl1)
        {
            extra_modifier_lvl1 = new ModExtraModifier(1);
            if (armor)
            {
            	ArmoryRegistry.registerModifier(extra_modifier_lvl1.getIdentifier(), extra_modifier_lvl1);
            	RecipeMatchHolder.addItem(extra_modifier_lvl1, subtypes.get(1), 1, 1);
            }
        }
        if (TinkersAddons.modConfig.enableExtraModifierLvl2)
        {
            extra_modifier_lvl2 = new ModExtraModifier(2);
            if (armor)
            {
            	ArmoryRegistry.registerModifier(extra_modifier_lvl2.getIdentifier(), extra_modifier_lvl2);
            	RecipeMatchHolder.addItem(extra_modifier_lvl2, subtypes.get(2), 1, 1);
            }
        }
        if (TinkersAddons.modConfig.enableExtraModifierLvl3)
        {
            extra_modifier_lvl3 = new ModExtraModifier(3);
            if (armor)
            {
            	ArmoryRegistry.registerModifier(extra_modifier_lvl3.getIdentifier(), extra_modifier_lvl3);
            	RecipeMatchHolder.addItem(extra_modifier_lvl3, subtypes.get(3), 1, 1);
            }
        }
        if (TinkersAddons.modConfig.enableExtraModifierLvl4)
        {
            extra_modifier_lvl4 = new ModExtraModifier(4);
            if (armor)
            {
            	ArmoryRegistry.registerModifier(extra_modifier_lvl4.getIdentifier(), extra_modifier_lvl4);
            	RecipeMatchHolder.addItem(extra_modifier_lvl4, subtypes.get(4), 1, 1);
            }
        }
    }
}