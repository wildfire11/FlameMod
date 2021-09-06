
package net.mcreator.flame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;

import net.mcreator.flame.procedures.DeathswardToolInHandTickProcedure;
import net.mcreator.flame.FlameModElements;

import java.util.Map;
import java.util.HashMap;

@FlameModElements.ModElement.Tag
public class DeathswardItem extends FlameModElements.ModElement {
	@ObjectHolder("flame:deathsward")
	public static final Item block = null;
	public DeathswardItem(FlameModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 9999;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 9997f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 1f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					DeathswardToolInHandTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("deathsward"));
	}
}
