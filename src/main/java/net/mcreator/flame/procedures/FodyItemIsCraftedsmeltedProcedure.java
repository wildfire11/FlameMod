package net.mcreator.flame.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.flame.FlameMod;

import java.util.Random;
import java.util.Map;

public class FodyItemIsCraftedsmeltedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FlameMod.LOGGER.warn("Failed to load dependency itemstack for procedure FodyItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}
