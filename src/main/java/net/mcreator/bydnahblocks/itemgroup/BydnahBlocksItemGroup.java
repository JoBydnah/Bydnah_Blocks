
package net.mcreator.bydnahblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bydnahblocks.item.BydnahLogoItem;
import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class BydnahBlocksItemGroup extends BydnahBlocksModElements.ModElement {
	public BydnahBlocksItemGroup(BydnahBlocksModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbydnah_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BydnahLogoItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
