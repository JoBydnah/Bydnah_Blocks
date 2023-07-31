
package net.mcreator.bydnahblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class OrichalcumHoeItem extends BydnahBlocksModElements.ModElement {
	@ObjectHolder("bydnah_blocks:orichalcum_hoe")
	public static final Item block = null;

	public OrichalcumHoeItem(BydnahBlocksModElements instance) {
		super(instance, 693);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1620;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 53;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OrichalcumIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("orichalcum_hoe"));
	}
}
