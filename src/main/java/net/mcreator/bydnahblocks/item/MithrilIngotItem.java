
package net.mcreator.bydnahblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class MithrilIngotItem extends BydnahBlocksModElements.ModElement {
	@ObjectHolder("bydnah_blocks:mithril_ingot")
	public static final Item block = null;

	public MithrilIngotItem(BydnahBlocksModElements instance) {
		super(instance, 662);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("mithril_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
