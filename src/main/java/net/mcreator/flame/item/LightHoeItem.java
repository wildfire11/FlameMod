
package net.mcreator.flame.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.flame.FlameModElements;

@FlameModElements.ModElement.Tag
public class LightHoeItem extends FlameModElements.ModElement {
	@ObjectHolder("flame:light_hoe")
	public static final Item block = null;
	public LightHoeItem(FlameModElements instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 5419;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 126;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LightItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("light_hoe"));
	}
}
