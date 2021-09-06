package net.mcreator.flame.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.flame.FlameMod;

import java.util.Map;
import java.util.Collections;

public class FodyItemIsDroppedByPlayerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FlameMod.LOGGER.warn("Failed to load dependency entity for procedure FodyItemIsDroppedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			public void removeRecipe(Entity _ent, ResourceLocation recipe) {
				if (_ent instanceof ServerPlayerEntity)
					((ServerPlayerEntity) _ent).world.getRecipeManager().getRecipe(recipe)
							.ifPresent(_rec -> ((ServerPlayerEntity) _ent).resetRecipes(Collections.singleton(_rec)));
			}
		}.removeRecipe(entity, new ResourceLocation("minecraft:diomond_sword"));
	}
}
