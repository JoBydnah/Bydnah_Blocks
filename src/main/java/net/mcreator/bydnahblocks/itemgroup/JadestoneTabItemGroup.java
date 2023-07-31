
package net.mcreator.bydnahblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bydnahblocks.item.JadestoneLogoItem;
import net.mcreator.bydnahblocks.BydnahBlocksModElements;

@BydnahBlocksModElements.ModElement.Tag
public class JadestoneTabItemGroup extends BydnahBlocksModElements.ModElement {
	public JadestoneTabItemGroup(BydnahBlocksModElements instance) {
		super(instance, 658);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbydnah_tab_jadestone") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(JadestoneLogoItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
