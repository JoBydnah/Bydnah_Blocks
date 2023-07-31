
package net.mcreator.bydnahblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class MithrilAxeItem extends BydnahBlocksModElements.ModElement {
	@ObjectHolder("bydnah_blocks:mithril_axe")
	public static final Item block = null;

	public MithrilAxeItem(BydnahBlocksModElements instance) {
		super(instance, 669);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1057;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 39;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MithrilIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("mithril_axe"));
	}
}
