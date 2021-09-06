package net.mcreator.flame.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.flame.FlameMod;

import java.util.Map;

public class FodyLivingEntityIsHitWithItemProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FlameMod.LOGGER.warn("Failed to load dependency itemstack for procedure FodyLivingEntityIsHitWithItem!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).setDamage((int) 1000);
	}
}
