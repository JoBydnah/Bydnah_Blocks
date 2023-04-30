
package net.mcreator.bydnahblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bydnahblocks.itemgroup.BydnahBlocksItemGroup;
import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class JadeItem extends BydnahBlocksModElements.ModElement {
	@ObjectHolder("bydnah_blocks:jade")
	public static final Item block = null;

	public JadeItem(BydnahBlocksModElements instance) {
		super(instance, 407);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BydnahBlocksItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("jade");
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
