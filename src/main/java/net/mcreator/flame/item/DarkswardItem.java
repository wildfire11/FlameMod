
package net.mcreator.flame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.flame.FlameModElements;

@FlameModElements.ModElement.Tag
public class DarkswardItem extends FlameModElements.ModElement {
	@ObjectHolder("flame:darksward")
	public static final Item block = null;
	public DarkswardItem(FlameModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10999;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10997f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("darksward"));
	}
}
